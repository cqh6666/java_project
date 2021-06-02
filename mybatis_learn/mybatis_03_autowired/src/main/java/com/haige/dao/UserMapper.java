package com.haige.dao;

import com.haige.pojo.User;
import org.apache.ibatis.annotations.Select;

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
    @Select("SELECT * FROM user WHERE id = #{id}")
    List<User> getUserListById(int id);

}
