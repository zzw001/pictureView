package scau.aotu.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import scau.aotu.biz.model.User;
import scau.aotu.biz.service.UserService;
import scau.aotu.core.util.ApplicationUtils;

@Controller
public class CommonController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model){


        return "login";

    }

    @RequestMapping("/register")
    public String register(){

        return "register";
    }

    @RequestMapping("/register/confirm")
    public String confirm(@RequestParam("username") String username, @RequestParam("email") String email, @RequestParam("password") String password, Model model, RedirectAttributes redirectAttributes){

        if(userService.getUserByUserName(username)!=null){
            System.out.println("username:"+userService.getUserByUserName(username));
            redirectAttributes.addFlashAttribute("error","用户名已存在");
            return "redirect:/register/unsuccess";
        }else if(userService.getUserByEmail(email)!=null){
            model.addAttribute("error","邮箱已存在");
            System.out.println("email:"+userService.getUserByEmail(email));
            return "register";
        }
        String code = ApplicationUtils.randomUUID();
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setState(1);
        System.out.println(user+":"+userService.addUser(user));
        return "redirect:/success";
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
