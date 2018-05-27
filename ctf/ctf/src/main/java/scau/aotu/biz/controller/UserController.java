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
            String school = request.getParameter("school").trim();
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
                errors.add("用户名不能为空");
            }else if(!userTemp.getUserName().equals(username)){
                User user1 = userService.getUserByUserName(username);
                if(user1 != null){
                    errors.add("用户名已存在");
                }else if(username.length()>10){
                    errors.add("用户名长度不能超过10");
                }else if(!pattern.matcher(regEx).matches()){
                    errors.add("用户名格式不正确,不能包含符号");
                }else {
                    user.setUserName(username);
                }
            }

            //校验邮箱
            regEx = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
            pattern = Pattern.compile(regEx);
            if(email.length() == 0){
                errors.add("邮箱不能为空");
            }else if(!userTemp.getEmail().equals(email)){
                User user1 = userService.getUserByEmail(email);
                if(email != null){
                    errors.add("邮箱已存在");
                }else if(email.length()>32){
                    errors.add("邮箱长度不能超过32位,请更换一个邮箱");
                }else if(!pattern.matcher(regEx).matches()){
                    errors.add("邮箱格式不正确");
                }else {
                    user.setEmail(email);
                }
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


            //校验号码



        }else if(request.getMethod() == "GET"){
            String username = (String) request.getSession().getAttribute("username");
            User user = userService.getUserByUserName(username);
            String schoolname=schoolService.getBySchoolId(user.getSchoolId()).getSchoolName();
            model.addAttribute("user",user);
            model.addAttribute("school",schoolname);
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
