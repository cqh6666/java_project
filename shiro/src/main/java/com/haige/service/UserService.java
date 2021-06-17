package com.haige.service;

import com.haige.pojo.User;

/**
 * @className: com.haige.service-> UserService
 * @description:
 * @author: cqh
 * @createDate: 2021-06-11 20:18
 * @version: 1.0
 * @todo:
 */
public interface UserService {
    User queryUserByName(String name);
}
