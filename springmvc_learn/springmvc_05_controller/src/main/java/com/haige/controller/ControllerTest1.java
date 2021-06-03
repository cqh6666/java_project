package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @className: com.haige.controller-> ControllerTest1
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 20:26
 * @version: 1.0
 * @todo:
 */

@Controller
public class ControllerTest1 {

    @RequestMapping("/test2")
    public String test1(Model model){
        model.addAttribute("msg","hellotest2");
        return "test";
    }
}
