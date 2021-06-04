import com.haige.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * @className: PACKAGE_NAME-> MyTest
 * @description:
 * @author: cqh
 * @createDate: 2021-06-03 22:47
 * @version: 1.0
 * @todo:
 */
public class MyTest {
    @Test
    public void test(){
        //排错
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Book queryAllBook : bookServiceImpl.queryAllBooks()) {
            System.out.println(queryAllBook);
        }
    }
}
