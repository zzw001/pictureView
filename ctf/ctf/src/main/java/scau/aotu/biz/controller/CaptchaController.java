package scau.aotu.biz.controller;

import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class CaptchaController {

    @RequestMapping("/images/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CaptchaUtil captcha = new CaptchaUtil();
        try {
            captcha.out(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
