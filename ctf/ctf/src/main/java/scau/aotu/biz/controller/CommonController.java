package scau.aotu.biz.controller;

import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import scau.aotu.biz.model.Authentication;
import scau.aotu.biz.model.School;
import scau.aotu.biz.model.User;
import scau.aotu.biz.service.AuthenticationService;
import scau.aotu.biz.service.SchoolService;
import scau.aotu.biz.service.UserService;
import scau.aotu.core.util.ApplicationUtils;
import scau.aotu.core.util.MailUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class CommonController {

    @Autowired
    private UserService userService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/login/confirm")
    public String loginConfirm(@RequestParam("email")String email, @RequestParam("password") String password,
                               @RequestParam("code")String code, Model model, HttpServletRequest request){
        System.out.println(email+":"+password+":"+code);
        CaptchaUtil captcha = new CaptchaUtil();
        if (captcha == null || !captcha.ver(code, request)) {
            model.addAttribute("error","邮箱或密码错误");
            return "login";
        }
        User user=userService.getUserByEmail(email);
        if(user == null){
            model.addAttribute("error","邮箱或密码错误");
            return "login";
        }else if(user.getState() == 0 ){
            model.addAttribute("error","账号未进行邮箱确认，请到邮箱中确认");
            return "login";
        }else if(user.getState() == -1){
            model.addAttribute("error","账号被锁定，请联系管理员");
            return "login";
        } else if(!user.getPassword().equals(password)){
            model.addAttribute("error","邮箱或密码错误");
            return "login";
        }
        model.addAttribute("username",user.getUserName());
        return "index";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/register/confirm")
    public String registerConfirm(@RequestParam("username") String username, @RequestParam("email") String email, @RequestParam("password") String password,
                          @RequestParam("school") String schoolname,@RequestParam("realname") String realname,@RequestParam("number") String number,
                          @RequestParam("type") String type,Model model, RedirectAttributes redirectAttributes){

        School school=schoolService.get(schoolname);

        if(userService.getUserByUserName(username)!=null){
            System.out.println("username:"+userService.getUserByUserName(username));
            redirectAttributes.addFlashAttribute("error","用户名已存在");
            return "redirect:/register/unsuccess";
        }else if(userService.getUserByEmail(email)!=null){
            model.addAttribute("error","邮箱已存在");
            System.out.println("email:"+userService.getUserByEmail(email));
            return "redirect:/register/unsuccess";
        }else if(school==null){
            model.addAttribute("error","学校不存在");
            return "redirect:/register/unsuccess";
        }
        //主键id未进行验证
        User user = new User();
        String userid = ApplicationUtils.randomUUID();
        user.setUserId(userid);
        user.setEmail(email);
        user.setUserName(username);
        user.setPassword(password);
        user.setRealName(realname);
        user.setSchoolId(school.getSchoolId());
        user.setUserNumber(number);
        user.setUserType(Integer.parseInt(type));
        user.setState(0);
        user.setScore(0);
        System.out.println(user);
        int sfl=userService.addUser(user);
        System.out.println(user+":"+sfl);

        String code = ApplicationUtils.randomUUID();
        Authentication authentication=new Authentication();
        authentication.setUserId(userid);
        authentication.setCode(code);
        authentication.setAuthType(0);
        authentication.setCreateTime(new Date());
        int afl=authenticationService.add(authentication);
        System.out.println(authentication+":"+afl);

        MailUtils.senMail(email,code);
        return "redirect:/success";
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
    public String unsuccess(@ModelAttribute("error") String error, Model model){

        model.addAttribute("error",error);
        return "register";
    }
    @RequestMapping("/success")
    public String success(){

        return "success";
    }
}
