package com.haige.mapper;


import com.haige.pojo.User;

import java.util.List;

/**
 * @className: com.com.com.haige.dao-> UserDao
 * @description:
 * @author: cqh
 * @createDate: 2021-05-30 18:21
 * @version: 1.0
 * @todo:
 */
public interface UserMapper {

    /**根据ID查询用户*/
    List<User> getUser();

    int addUser(User user);


}
