package com.haige.dao;

import com.haige.pojo.User;
import com.haige.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @className: com.com.haige.dao-> OverTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-31 21:48
 * @version: 1.0
 * @todo:
 */
public class OverTest {

    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userListById = mapper.getUserListById(1);
        for (User user : userListById) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
