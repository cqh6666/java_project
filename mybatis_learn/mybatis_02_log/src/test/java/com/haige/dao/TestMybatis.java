package com.haige.dao;

import com.haige.pojo.User;
import com.haige.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


/**
 * @className: com.haige-> TestMybatis
 * @description:
 * @author: cqh
 * @createDate: 2021-05-30 17:57
 * @version: 1.0
 * @todo:
 */
public class TestMybatis {

    static Logger logger = Logger.getLogger(TestMybatis.class);

    @Test
    public void GetUserByIdTest(){


        // 获取sqlsession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 用户
        User user = userMapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();

    }

    @Test
    public void log4jTest(){

        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        List<User> userList = userMapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
