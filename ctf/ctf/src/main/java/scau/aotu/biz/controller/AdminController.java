package scau.aotu.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @RequestMapping("/")
    public String admin(){
        return "/admin/index";
    }

    @RequestMapping("/chal/new")
    public String admin_create_chal(HttpServletRequest request){
        if(request.getMethod() == "POST"){
            String chal_name = request.getParameter("name").trim();
            String category = request.getParameter("category").trim();
        }

        return "/admin/chal_new";
    }
}
