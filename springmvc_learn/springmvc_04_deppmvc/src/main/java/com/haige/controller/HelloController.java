package com.haige.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @className: com.haige.controller-> HelloController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 19:53
 * @version: 1.0
 * @todo:
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        // 业务代码
        String result = "HelloMVC";
        mv.addObject("msg", result);

        // 视图跳转
        mv.setViewName("test");

        return mv;
    }
}
