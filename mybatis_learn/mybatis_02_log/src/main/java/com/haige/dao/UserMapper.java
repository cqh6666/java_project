package com.haige.dao;

import com.haige.pojo.User;

import java.util.List;
import java.util.Map;

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
    User getUserById(int id);

    List<User> getUserByLimit(Map<String, Integer> map);

}
