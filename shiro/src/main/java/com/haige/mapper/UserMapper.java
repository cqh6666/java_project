package com.haige.mapper;

import com.haige.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @className: com.haige.mapper-> UserMapper
 * @description:
 * @author: cqh
 * @createDate: 2021-06-11 20:14
 * @version: 1.0
 * @todo:
 */
@Repository
@Mapper
public interface UserMapper {
    User queryUserByName(String name);
}
