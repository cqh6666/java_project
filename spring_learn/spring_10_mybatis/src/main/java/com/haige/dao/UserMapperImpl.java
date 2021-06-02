package com.haige.dao;

import com.haige.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @className: com.haige.dao-> UserMapperImpl
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 22:02
 * @version: 1.0
 * @todo:
 */
public class UserMapperImpl implements UserMapper {

    /**
     * 原来所有操作都使用sqlsession来执行
     * 现在都是用sqlsessionTemaplate
     * @param id
     * @return
     */

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
