package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @className: com.haige.controller-> LoginController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-09 19:51
 * @version: 1.0
 * @todo:
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        // 具体业务
        if(!StringUtils.isEmpty(username) && "123123".equals(password)){
            session.setAttribute("loginUserInfo",username);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg", "用户密码错误！");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logou(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }


}
