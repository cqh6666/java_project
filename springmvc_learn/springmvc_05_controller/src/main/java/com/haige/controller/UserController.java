package com.haige.controller;

import com.haige.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @className: com.haige.controller-> UserController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 21:33
 * @version: 1.0
 * @todo:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        /*前端必须通过username识别*/
        System.out.println("接收到前端的参数为:"+name);
        model.addAttribute("msg",name);
        return "test";
    }

    @GetMapping("/t2")
    public String test2(User user){
        // 通过get传参匹配User属性获得User
        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    public String test3(@RequestParam("username") String name, ModelMap map){
        map.addAttribute("name",name);
        System.out.println(name);
        return "test";
    }
}
