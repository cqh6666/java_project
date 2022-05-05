package com.haige;

import com.haige.config.MainConfigAOP;
import com.haige.service.Calculator;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @className: com.haige-> SpringAopTest
 * @description:
 * @author: cqh
 * @createDate: 2022-04-26 12:19
 * @version: 1.0
 * @todo:
 */
@SpringBootTest
public class SpringAopTest {

    @Autowired
    public Calculator calculator;

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigAOP.class);
        calculator.div(2,1);
    }
}
