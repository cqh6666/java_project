import com.haige.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-26 17:00
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("User");
        user.show();
    }
}
