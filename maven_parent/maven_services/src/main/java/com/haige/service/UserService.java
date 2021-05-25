package com.haige.service;

import com.haige.dao.UserDao;

/**
 * @className: com.haige.service-> UserService
 * @description:
 * @author: cqh
 * @createDate: 2021-05-25 20:58
 * @version: 1.0
 * @todo:
 */
public class UserService {
    public static void testService(){
        System.out.println("testService ...");
        UserDao.testDao();
    }
}
