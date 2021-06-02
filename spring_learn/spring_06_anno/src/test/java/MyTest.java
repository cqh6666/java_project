import com.haige.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description: 测试
 * @author: cqh
 * @createDate: 2021-05-26 20:29
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao user = (UserDao) context.getBean("userDao");
        System.out.println(user.name);

    }
}
