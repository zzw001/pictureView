package scau.aotu.biz.controller;

import com.wf.captcha.utils.CaptchaUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import scau.aotu.biz.model.Authentication;
import scau.aotu.biz.model.School;
import scau.aotu.biz.model.User;
import scau.aotu.biz.model.UserRole;
import scau.aotu.biz.service.AuthenticationService;
import scau.aotu.biz.service.SchoolService;
import scau.aotu.biz.service.UserRoleService;
import scau.aotu.biz.service.UserService;
import scau.aotu.core.util.ApplicationUtils;
import scau.aotu.core.util.MailUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Controller
public class CommonController {

    @Autowired
    private UserService userService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserRoleService userRoleService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request,Model model){
        if(request.getMethod() == "POST"){

            String email = request.getParameter("email").trim();
            String password = request.getParameter("password");
            String code = request.getParameter("code").trim();

            CaptchaUtil captcha = new CaptchaUtil();
            if (code == null || !captcha.ver(code, request)) {
                model.addAttribute("error","验证码错误");
                return "login";
            }
            Subject currentUser = SecurityUtils.getSubject();
            if(!currentUser.isAuthenticated()){
                UsernamePasswordToken token = new UsernamePasswordToken(email,password);
                try {
                    currentUser.login(token);
                    User user=userService.getUserByEmail(email);
                    request.getSession().setAttribute("username",user.getUserName());
                } catch (AuthenticationException e) {
                    // TODO: handle exception
                    model.addAttribute("error","邮箱或密码错误");
                    return "login";
                }
            }else{
                String shiroUsername =  (String) currentUser.getPrincipal();
                System.out.println(shiroUsername);
                if(!shiroUsername.equalsIgnoreCase(email)){
                    UsernamePasswordToken token = new UsernamePasswordToken(email,password);
                    try {
                        currentUser.login(token);
                        User user=userService.getUserByEmail(email);
                        request.getSession().setAttribute("username",user.getUserName());
                    } catch (AuthenticationException e) {
                        // TODO: handle exception
                        model.addAttribute("error","邮箱或密码错误");
                        return "login";
                    }
                }
            }
            return "redirect:/";
        }
        return "login";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request,Model model){
        if(request.getMethod() == "POST"){
            String username = request.getParameter("username").trim();
            String email = request.getParameter("email").trim();
            String password = request.getParameter("password");
            String schoolname = request.getParameter("schoolname").trim();
            System.out.println(username+":"+email+":"+password+":"+schoolname);

            String regEx = null;
            Pattern pattern = null;
            String error = null;
            User user = new User();

            //校验用户名
            regEx = "^[\u4E00-\u9FA5a-zA-Z0-9_]*$";
            pattern = Pattern.compile(regEx);

            if(username.length() == 0){
                error = "用户名不能为空";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else if(username.length()>10){
                error = "用户名长度不能超过10";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else if(!pattern.matcher(username).matches()){
                error = "用户名格式不正确,不能包含符号";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else{
                User user1 = userService.getUserByUserName(username);
                if(user1 != null){
                    error = "用户名已存在";
                    model.addAttribute("error",error);
                    List<String> schoolnames = schoolService.getAllSchoolName();
                    model.addAttribute("school","请选择学校");
                    model.addAttribute("schoolnames",schoolnames);
                    return "register";
                }else{
                    user.setUserName(username);
                }
            }

            //校验邮箱
            regEx = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
            pattern = Pattern.compile(regEx);
            if(email.length() == 0){
                error = "邮箱不能为空";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else if(email.length() > 30){
                error = "邮箱长度不能超过30";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else if(!pattern.matcher(email).matches()){
                error = "邮箱格式不正确";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else{
                User user1 = userService.getUserByEmail(email);
                if(user1 != null){
                    error = "邮箱已存在";
                    model.addAttribute("error",error);
                    List<String> schoolnames = schoolService.getAllSchoolName();
                    model.addAttribute("school","请选择学校");
                    model.addAttribute("schoolnames",schoolnames);
                    return "register";
                }else{
                    user.setEmail(email);
                }
            }

            //校验密码
            if(password.length() > 63){
                error = "密码长度太长";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else{
                user.setPassword(password);
            }

            //校验学校
            if(schoolname.equals("请选择学校")){
                error = "请选择学校";
                model.addAttribute("error",error);
                List<String> schoolnames = schoolService.getAllSchoolName();
                model.addAttribute("school","请选择学校");
                model.addAttribute("schoolnames",schoolnames);
                return "register";
            }else{
                School school = schoolService.getBySchoolName(schoolname);
                if(school == null){
                    error = "未选择学校";
                    model.addAttribute("error",error);
                    List<String> schoolnames = schoolService.getAllSchoolName();
                    model.addAttribute("school","请选择学校");
                    model.addAttribute("schoolnames",schoolnames);
                    return "register";
                }else{
                    user.setSchoolId(school.getSchoolId());
                }
            }

            String userid = ApplicationUtils.randomUUID();
            user.setUserId(userid);
            user.setUserType(0);
            user.setState(0);
            user.setScore(0);
            userService.addUser(user);

            String code = ApplicationUtils.randomUUID();
            Authentication authentication = new Authentication();
            authentication.setUserId(userid);
            authentication.setCode(code);
            authentication.setAuthType(0);
            authentication.setCreateTime(new Date());
            authenticationService.add(authentication);

            UserRole userRole = new UserRole();
            userRole.setUserId(userid);
            userRole.setRoleId(4);
            userRoleService.add(userRole);

            MailUtils.senMail(email,code);
            return "redirect:/success";
        }else{
            List<String> schoolnames = schoolService.getAllSchoolName();
            System.out.println(schoolnames);
            model.addAttribute("school","请选择学校");
            model.addAttribute("schoolnames",schoolnames);
        }

        return "register";
    }

    @RequestMapping("/register/authenticate/{code}")
    public String authenticate(@PathVariable("code") String code){


        String userid = authenticationService.getUserId(code);
        User user = userService.getUserByPrimaryKey(userid);
        if(userid == null){
            return "authunsuccess";
        }
        System.out.println("before:"+user);
        user.setState(1);
        userService.update(user);
        System.out.println("after:"+userService.getUserByPrimaryKey(userid));
        return "authsuccess";
    }

    @RequestMapping("/register/unsuccess")
    public String registerUnsuccess(@ModelAttribute("error") String error, Model model){
        model.addAttribute("error",error);
        return "register";
    }

    @RequestMapping("/success")
    public String registerSuccess(){
        return "success";
    }

    @RequestMapping("/login/success")
    public String loginSuccess(@ModelAttribute("username") String username, Model model){
        model.addAttribute("username",username);
        return "index";
    }
}
