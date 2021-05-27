import com.haige.service.UserService;
import com.haige.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 16:30
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是接口
        UserService service = context.getBean("userService", UserService.class);

        service.add();
    }
}
