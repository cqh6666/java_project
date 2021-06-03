package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @className: com.haige.controller-> ModelTest1
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 21:21
 * @version: 1.0
 * @todo:
 */

@Controller
public class ModelTest1 {

    @RequestMapping("m1/t1")
    public String test(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getSession().getId());
        return "test";
    }

    @RequestMapping("/m1/t2")
    public String test1(){
        /*重定向*/
        return "redirect:/index.jsp";
    }

    @RequestMapping("/m1/t3")
    public String test2(){
        /*转发*/
        return "forward:/index.jsp";
    }
}
