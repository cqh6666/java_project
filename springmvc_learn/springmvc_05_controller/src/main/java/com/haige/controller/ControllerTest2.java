package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: com.haige.controller-> ControllerTest2
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 20:44
 * @version: 1.0
 * @todo:
 */

@Controller
@RequestMapping("/c3")
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }
}
