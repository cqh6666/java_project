package com.haige.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.haige.controller-> TestController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-08 14:55
 * @version: 1.0
 * @todo:
 */

@RestController
public class TestController {
    @RequestMapping("/t1")
    public String test(){
        System.out.println("TestController test()执行");
        return "hello";
    }
}
