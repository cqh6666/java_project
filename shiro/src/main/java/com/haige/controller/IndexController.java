package com.haige.controller;

import com.haige.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className: com.haige.controller-> IndexController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-11 16:34
 * @version: 1.0
 * @todo:
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("msg","hello, shiro!");
        return "index";
    }

    @RequestMapping("/user/add")
    public String add(){
        return "user/add";
    }

    @RequestMapping("/user/update")
    public String update(){
        return "user/update";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String password, Model model){
        // 获取当前用户
        Subject subject = SecurityUtils.getSubject();

        // 封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行登录方法，如果没有异常，说明ok
        try {
            subject.login(token);
            return "index";
        } catch (UnknownAccountException e){
            model.addAttribute("msg", "用户名不存在！");
            return "login";
        } catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误！");
            return "login";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            model.addAttribute("msg","登录出现了问题！");
            return "index";
        }
    }

    @RequestMapping("/noauth")
    @ResponseBody
    public String unAuthorized(){
        return "vip等级不够，请充钱！";
    }
}
