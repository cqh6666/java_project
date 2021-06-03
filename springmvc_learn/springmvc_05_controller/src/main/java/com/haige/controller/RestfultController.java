package com.haige.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @className: com.haige.controller-> RestfultController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 20:51
 * @version: 1.0
 * @todo:
 */
@Controller
public class RestfultController {

    /**
     *
     * @param a
     * @param b
     * @param model
     * @return
     */

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","result:"+res);
        return "test";
    }
}
