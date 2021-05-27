package com.haige.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @className: com.haige.dao-> User
 * @description: 用户类
 * @author: cqh
 * @createDate: 2021-05-26 20:27
 * @version: 1.0
 * @todo:
 */
@Repository
public class UserDao {

    @Value("海鸽")
    public String name ;

}
