package scau.aotu.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import scau.aotu.biz.model.Category;
import scau.aotu.biz.model.Challenge;
import scau.aotu.biz.model.User;
import scau.aotu.biz.service.CategoryService;
import scau.aotu.biz.service.ChallengeService;
import scau.aotu.biz.service.UserService;
import scau.aotu.core.util.ApplicationUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @Autowired
    private ChallengeService challengeService;

    @RequestMapping("/")
    public String admin(){
        return "/admin/index";
    }

    @RequestMapping("/chal/new")
    public String create_chal(HttpServletRequest request, Model model){
        if(request.getMethod() == "POST"){
            String chalname = request.getParameter("name").trim();
            String catename = request.getParameter("catename");
            String chaldesc = request.getParameter("description");
            String score = request.getParameter("score");
            String flag = request.getParameter("flag");
            String point = request.getParameter("point");
            String writeup = request.getParameter("writeup");
            List<String> errors = new ArrayList<>();

            Challenge challenge = new Challenge();
            String chalid = ApplicationUtils.randomUUID();
            //设置题目id
            challenge.setChalId(chalid);
            //设置题目名字
            if(chalname.length() > 30){
                errors.add("题目名字字数不能超过30");
            }else{
                challenge.setChalName(chalname);
            }
            //设置题目描述
            if(chaldesc.length()>250){
                errors.add("题目描述字数不能超过250");
            }else{
                challenge.setChalDesc(chaldesc);
            }
            //设置分类id
            Category category = categoryService.getByCateName(catename);
            if(category == null){
                errors.add("请选择题目分类");
            }else {
                challenge.setCateId(category.getCateId());
            }
            //设置积分
            try {
                int chalscore = Integer.parseInt(score);
                if(chalscore < 10 || chalscore > 100 ){
                    errors.add("积分在10到100之间");
                }else{
                    challenge.setChalScore(chalscore);
                }
            } catch (NumberFormatException e) {
                errors.add("积分在10到100之间");
            }
            //设置flag
            if(flag.length() > 60){
                errors.add("flag长度不能超过60");
            }else {
                challenge.setFlag(flag);
            }
            //设置题目来源
            challenge.setChalSource("出题人出题");
            //设置考查点
            if(point.length() > 60){
                errors.add("考查点字数不超过60");
            }
            //设置解题思路
            if(writeup.length() > 250){
                errors.add("解题思路字数不超过250");
            }
            //设置显示状态
            challenge.setShowState(0);
            //设置出题人
            User user = userService.getUserByUserName((String) request.getSession().getAttribute("username"));
            challenge.setAuthorId(user.getUserId());

            System.out.println(challenge);
            challengeService.add(challenge);


        }else if(request.getMethod() == "GET"){
            List<String> categorys = categoryService.getAllCateName();
            model.addAttribute("catename","请选择分类");
            model.addAttribute("categorys",categorys);
        }
        return "/admin/chal_new";
    }

    public String chal_all(){
        return "/admin/challenges";
    }
}
