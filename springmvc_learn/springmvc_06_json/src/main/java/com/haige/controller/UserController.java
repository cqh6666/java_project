package com.haige.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haige.pojo.User;
import com.haige.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Date;

import static com.haige.utils.JsonUtils.getJson;

/**
 * @className: com.haige.controller-> UserController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 22:25
 * @version: 1.0
 * @todo:
 */

@RestController
public class UserController {

    /*不会走视图解析器，直接返回真实返回的东西，返回字符串*/
    @RequestMapping(value = "/j1")
    public String json1() throws JsonProcessingException {
        User user = new User(8, "海鸽2", "1231231");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping(value = "/j2")
    public String json2() {

        ArrayList<User> userList = new ArrayList<User>();

        userList.add(new User(1, "海鸽1", "1231231"));
        userList.add(new User(2, "海鸽2", "1231231"));
        userList.add(new User(3, "海鸽3", "1231231"));
        userList.add(new User(4, "海鸽4", "1231231"));

        return JsonUtils.getJson(userList);
    }

    @RequestMapping(value = "/j3")
    public String json3() {

        Date date = new Date();
        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping(value = "/j4")
    public String json4() {

        ArrayList<User> userList = new ArrayList<User>();

        userList.add(new User(1, "海鸽1", "1231231"));
        userList.add(new User(2, "海鸽2", "1231231"));
        userList.add(new User(3, "海鸽3", "1231231"));
        userList.add(new User(4, "海鸽4", "1231231"));


        return JSON.toJSONString(userList);
    }
}
