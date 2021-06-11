package com.haige.controller;

import com.haige.mapper.UserMapper;
import com.haige.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: com.haige.controller-> UserController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-10 18:31
 * @version: 1.0
 * @todo:
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getuserlist")
    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }
}
