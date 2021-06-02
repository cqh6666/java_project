package com.haige.mapper;

import com.haige.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @className: com.haige.dao-> UserMapperImpl
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 22:02
 * @version: 1.0
 * @todo:
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    /**
     * 原来所有操作都使用sqlsession来执行
     * 现在都是用sqlsessionTemaplate
     * @param
     * @return
     */

    public List<User> getUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }
}
