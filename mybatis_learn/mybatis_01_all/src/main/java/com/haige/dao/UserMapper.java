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


    //获取全部用户
    List<User> getUserList();

    // 模糊查询
    List<User> getUserLike(String value);

    // 根据ID查询用户
    User getUserById(int id);

    // 插入用户
    int addUser(User user);

    // map
    int addUser2(Map<String, Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);


}
