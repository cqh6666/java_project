package com.haige.mapper;

import com.haige.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @className: com.haige.mapper-> UserMapper
 * @description:
 * @author: cqh
 * @createDate: 2021-06-10 18:19
 * @version: 1.0
 * @todo:
 */

@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);



}
