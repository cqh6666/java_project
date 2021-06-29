package haige.reflection.classloader;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @className: haige.reflection.class_-> ClassLoader
 * @description: 类加载
 * @author: cqh
 * @createDate: 2021-06-17 20:56
 * @version: 1.0
 * @todo:
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");
        String key = scanner.next();

        switch (key){
            case "1":
//                Dog dog = new Dog();
                break;
            case "2":
                Class cls = Class.forName("Person");
                Object o = cls.newInstance();
                Method hello = cls.getMethod("hello");
                hello.invoke(o);
                System.out.println("done!");
                break;
            default:
                System.out.println("do nothing...");
        }
    }

}
