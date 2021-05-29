package com.haige.dao;

import com.haige.pojo.User;
import com.haige.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @className: com.haige.dao-> UserDaoTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 22:54
 * @version: 1.0
 * @todo:
 */
public class UserDaoTest {
    @Test
    public void test() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();

        String statement = "com.haige.dao.mapper.getUserList";
        User user = session.selectOne(statement,2);
        System.out.println(user);

        session.close();
    }
}
