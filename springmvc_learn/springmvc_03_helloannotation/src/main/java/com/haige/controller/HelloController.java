package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: com.haige.controller-> HelloController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 17:56
 * @version: 1.0
 * @todo:
 */
@Controller
public class HelloController {

    //真实访问地址 : 项目名/hello
    @RequestMapping("/hello")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC");
        //web-inf/jsp/hello.jsp
        return "hello";
    }

    @RequestMapping("/hello2")
    public String sayHello2(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello2,SpringMVC");
        //web-inf/jsp/hello.jsp
        return "hello2";
    }
}