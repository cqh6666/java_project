package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @className: com.haige.controller-> LoginController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-08 15:04
 * @version: 1.0
 * @todo:
 */

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/doLogin")
    public String doLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession httpSession, String username, String password){
        // 登录之后吧用户的信息存在session中

        httpSession.setAttribute("userLoginInfo",username);
        return "main";
    }
}
