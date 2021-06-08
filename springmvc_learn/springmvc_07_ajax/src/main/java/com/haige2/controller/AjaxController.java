package com.haige2.controller;


import com.haige2.pojo.User;
import com.haige2.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: com.haige.controller-> AjaxController
 * @description: ajax测试
 * @author: cqh
 * @createDate: 2021-06-08 9:51
 * @version: 1.0
 * @todo:
 */

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        if ("haige".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> users = new ArrayList<User>();

        users.add(new User("haige",22,"男"));
        users.add(new User("haige2",23,"男"));
        users.add(new User("haige3",24,"男"));
        users.add(new User("haige4",25,"男"));
        return users;
    }
}
