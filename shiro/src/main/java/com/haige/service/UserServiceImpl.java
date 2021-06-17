package com.haige.service;

import com.haige.mapper.UserMapper;
import com.haige.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: com.haige.service-> UserServiceImpl
 * @description:
 * @author: cqh
 * @createDate: 2021-06-11 20:19
 * @version: 1.0
 * @todo:
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}
