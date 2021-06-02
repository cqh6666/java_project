import com.haige.dao.UserMapper;
import com.haige.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 22:07
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.getUser()) {
            System.out.println(user);
        }
    }
}
