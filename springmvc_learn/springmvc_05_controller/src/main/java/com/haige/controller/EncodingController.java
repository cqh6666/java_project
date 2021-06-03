package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @className: com.haige.controller-> EncodingController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 21:52
 * @version: 1.0
 * @todo:
 */

@Controller
public class EncodingController {

    @PostMapping("/e/t1")
    public String test1(String name, Model model){
        model.addAttribute("name",name);
        return "test";
    }
}
