package scau.aotu.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import scau.aotu.biz.model.User;
import scau.aotu.biz.service.SchoolService;
import scau.aotu.biz.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/profile")
    public String profile(HttpServletRequest request,Model model){
        if(request.getMethod()=="POST"){
            List<String> errors = new ArrayList<>();
            String username = request.getParameter("username").trim();
            String email = request.getParameter("email").trim();
            String currentpassword = request.getParameter("currentpassword");
            String newpassword = request.getParameter("newpassword");
            String realname = request.getParameter("realname").trim();
            String number = request.getParameter("number").trim();
            String regEx = null;
            Pattern pattern = null;
            User user = new User();
            User userTemp = null;

            //当前账号信息
            userTemp = userService.getUserByUserName((String) request.getSession().getAttribute("username"));

            //校验用户名
            regEx = "^[\u4E00-\u9FA5a-zA-Z0-9_]*$";
            pattern = Pattern.compile(regEx);
            if(username.length() == 0){
                user.setUserName(userTemp.getUserName());
            }else if(!userTemp.getUserName().equals(username)){
                User user1 = userService.getUserByUserName(username);
                if(user1 != null){
                    errors.add("用户名已存在");
                }else if(username.length()>10){
                    errors.add("用户名长度不能超过10");
                }else if(!pattern.matcher(username).matches()) errors.add("用户名格式不正确,不能包含符号");
                else {
                    user.setUserName(username);
                }
            }else {
                user.setUserName(userTemp.getUserName());
            }

            //校验邮箱
            regEx = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
            pattern = Pattern.compile(regEx);
            if(email.length() == 0){
                user.setEmail(userTemp.getEmail());
            }else if(!userTemp.getEmail().equals(email)){
                User user1 = userService.getUserByEmail(email);
                if(user1 != null){
                    errors.add("邮箱已存在");
                }else if(email.length()>30){
                    errors.add("邮箱长度不能超过30位,请更换一个邮箱");
                }else if(!pattern.matcher(email).matches()){
                    errors.add("邮箱格式不正确");
                }else {
                    user.setEmail(email);
                    user.setState(0);
                }
            }else {
                user.setEmail(userTemp.getEmail());
            }

            //校验密码
            if(currentpassword.length() != 0 && newpassword.length() !=0 ){
                if(!userTemp.getPassword().equals(currentpassword)){
                    errors.add("当前密码错误");
                }else {
                    user.setPassword(newpassword);
                }
            }else if(currentpassword.length() ==0 && newpassword.length() !=0){
                errors.add("请填写当前密码");
            }else if(currentpassword.length() !=0 && newpassword.length() ==0){
                errors.add("请填写新密码");
            }

            //校验真实姓名
            regEx = "^[\u4E00-\u9FA5]{2,10}$";
            pattern = Pattern.compile(regEx);
            if(realname.length() == 0){
                user.setRealName(userTemp.getRealName());
            }else if(realname.length() < 2 || realname.length() >10){
                errors.add("真实姓名长度应大于1,小于10");
            }else if(!pattern.matcher(realname).matches()){
                errors.add("真实姓名格式错误");
            }else {
                user.setRealName(realname);
            }

            //校验号码
            regEx = "^[1-9][0-9]{1,14}";
            pattern = Pattern.compile(regEx);
            if(number.length() == 0 ){
                userTemp.setUserNumber(userTemp.getUserNumber());
            }else if(number.length() >14){
                errors.add("学号长度不能超过15");
            }else  if(!pattern.matcher(number).matches()){
                if(userTemp.getUserType() == 0){
                    errors.add("学号错误");
                }else {
                    errors.add("工号错误");
                }
            }else {
                user.setUserNumber(number);
            }

            if(errors.size()>0){
                model.addAttribute("errors",errors);
                model.addAttribute("user",userTemp);
            }else{
                System.out.println(user);
                user.setUserId(userTemp.getUserId());
                userService.update(user);
                user = userService.getUserByPrimaryKey(userTemp.getUserId());
                System.out.println(user);
                if(!userTemp.getEmail().equals(user.getEmail())){
                    model.addAttribute("success","请到邮箱中进行确认");
                }else{
                    model.addAttribute("success","更新成功");
                }
                model.addAttribute("user",user);
                request.getSession().setAttribute("username",user.getUserName());
            }

        }else if(request.getMethod() == "GET"){
            String username = (String) request.getSession().getAttribute("username");
            User user = userService.getUserByUserName(username);
            model.addAttribute("user",user);
        }
        return "profile";
    }

    @RequestMapping("/team")
    public String team(HttpServletRequest request,Model model){
        String username = (String) request.getSession().getAttribute("username");
        User user = userService.getUserByUserName(username);
        model.addAttribute("user",user);
        return "team";
    }


    @RequestMapping("/challengeboard")
    public String challengeboard(){
        return "challengeboard";
    }

    @RequestMapping("/scoreboard")
    public String scoreboard(){
        return "scoreboard";
    }
}
