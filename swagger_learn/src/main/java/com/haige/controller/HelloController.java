package com.haige.controller;

import com.haige.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.haige.controller-> HelloController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-15 20:39
 * @version: 1.0
 * @todo:
 */
@Api(tags = "hello控制器")
@RestController
public class HelloController {

    @ApiOperation("hello控制器")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ApiOperation("user控制器")
    @PostMapping("/user")
    public User user(){
        return new User();
    }
}
