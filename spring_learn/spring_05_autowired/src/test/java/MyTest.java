import com.haige.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-26 19:25
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    public static void testMethodAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        people.getCat().shout();
        people.getDog().shout();
        System.out.println(people.getName());
    }

    public static void main(String[] args) {
        testMethodAutowire();
    }
}
