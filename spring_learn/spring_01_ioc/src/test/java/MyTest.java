import com.haige.dao.UserDaoImpl;
import com.haige.dao.UserDaoMysqqlImpl;
import com.haige.service.UserService;
import com.haige.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-26 15:03
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
