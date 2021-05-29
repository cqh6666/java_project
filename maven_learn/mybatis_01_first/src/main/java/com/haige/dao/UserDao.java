package com.haige.dao;

import com.haige.pojo.User;

import java.util.List;

/**
 * @className: com.haige.dao-> UserDao
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 22:42
 * @version: 1.0
 * @todo:
 */
public interface UserDao {
    List<User> getUserList();
}
