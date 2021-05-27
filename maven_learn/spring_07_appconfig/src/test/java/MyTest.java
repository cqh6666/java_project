import com.haige.config.HaiConfig;
import com.haige.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-26 21:01
 * @version: 1.0
 * @todo:
 */
public class MyTest {


    public static void main(String[] args) {
        // 如果完全使用配置类，只能使用AnnotationConfigApplicationContext来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(HaiConfig.class);
        User getUser = (User)context.getBean("getUser"); // user也行
        System.out.println(getUser.getName());
    }


}
