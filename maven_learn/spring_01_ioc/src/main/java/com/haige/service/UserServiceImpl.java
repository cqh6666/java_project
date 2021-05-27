package com.haige.service;

import com.haige.dao.UserDao;
import com.haige.dao.UserDaoImpl;

/**
 * @className: com.haige.service-> UserServiceImpl
 * @description:
 * @author: cqh
 * @createDate: 2021-05-26 15:00
 * @version: 1.0
 * @todo:
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    // 利用set动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
