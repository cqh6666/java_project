import com.haige.mapper.UserMapper;
import com.haige.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 14:21
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.getUser()) {
            System.out.println(user);
        }
    }

}
