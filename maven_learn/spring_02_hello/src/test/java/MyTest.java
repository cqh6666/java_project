import com.haige.pojo.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description: 实例化
 * @author: cqh
 * @createDate: 2021-05-26 16:03
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象在Spring中管理，要使用，直接去里面取出来 取id
        HelloSpring hello = (HelloSpring) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
