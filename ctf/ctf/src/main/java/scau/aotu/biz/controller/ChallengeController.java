package scau.aotu.biz.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ChallengeController {

    @RequestMapping("/challenge")
    public String challenge() {
        return "challenge";
    }

    @RequestMapping("/chals")
    public void chals(HttpServletResponse response){
        String data = "{\"game\":[{\"category\":\"Multiple Choice\",\"id\":3,\"name\":\"Trivia\",\"script\":\"/plugins/challenges/assets/standard-challenge-modal.js\",\"tags\":[],\"template\":\"/plugins/challenges/assets/standard-challenge-modal.njk\",\"type\":\"multiple-choice\",\"value\":42},{\"category\":\"Programming\",\"id\":1,\"name\":\"Squares\",\"script\":\"/plugins/challenges/assets/standard-challenge-modal.js\",\"tags\":[],\"template\":\"/plugins/challenges/assets/standard-challenge-modal.njk\",\"type\":\"code\",\"value\":100},{\"category\":\"Forensics\",\"id\":2,\"name\":\"Too Many Puppers\",\"script\":\"/plugins/challenges/assets/standard-challenge-modal.js\",\"tags\":[],\"template\":\"/plugins/challenges/assets/standard-challenge-modal.njk\",\"type\":\"standard\",\"value\":100},{\"category\":\"Programming\",\"id\":4,\"name\":\"Reverse a String\",\"script\":\"/plugins/challenges/assets/standard-challenge-modal.js\",\"tags\":[],\"template\":\"/plugins/challenges/assets/standard-challenge-modal.njk\",\"type\":\"code\",\"value\":100}]}";
        response.setContentType("application/json");
        try {
            response.getWriter().print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/solves")
    public void solves(HttpServletResponse response){
        String data = "{\"solves\":[{\"category\":\"Forensics\",\"chal\":\"Too Many Puppers\",\"chalid\":2,\"team\":1,\"time\":1527385900,\"value\":100}]}";
        response.setContentType("application/json");
        try {
            response.getWriter().print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/usersolves")
    public void chals_solves(HttpServletResponse response){
        String data = "{\"1\":0,\"2\":0,\"3\":19,\"4\":20,\"5\":0}";
        response.setContentType("application/json");
        try {
            response.getWriter().print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/chal/{chalid}")
    public void chalid(@PathVariable("chalid")String chalid, HttpServletResponse response){
        System.out.println(chalid);
        String data = "{\"category\":\"Forensics\",\"description\":\"Here is a zip file full of just the finest little puppers. Can you find the hidden flag in the pile of pupper pictures?\\r\\n\\r\\nThe answer is `flag{0h_y0u've_found_me}`\",\"files\":[\"fb49c5a63618a5c72cff704527abefd8/puppy.zip\"],\"hidden\":false,\"hints\":[],\"id\":2,\"max_attempts\":0,\"name\":\"Too Many Puppers\",\"tags\":[],\"type\":\"standard\",\"type_data\":{\"id\":\"standard\",\"name\":\"standard\",\"scripts\":{\"create\":\"/plugins/challenges/assets/standard-challenge-create.js\",\"modal\":\"/plugins/challenges/assets/standard-challenge-modal.js\",\"update\":\"/plugins/challenges/assets/standard-challenge-update.js\"},\"templates\":{\"create\":\"/plugins/challenges/assets/standard-challenge-create.njk\",\"modal\":\"/plugins/challenges/assets/standard-challenge-modal.njk\",\"update\":\"/plugins/challenges/assets/standard-challenge-update.njk\"}},\"value\":100}";
        response.setContentType("application/json");
        try {
            response.getWriter().print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
