package com.haige;

import com.haige.pojo.User;
import com.haige.service.UserService;
import com.haige.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user = userService.queryUserByName("Is");
        System.out.println(user);
    }

}
