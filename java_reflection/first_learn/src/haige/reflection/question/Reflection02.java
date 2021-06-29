package haige.reflection.question;

import haige.Cat;

import java.lang.reflect.Method;

import static java.lang.Class.forName;

/**
 * @className: haige.reflection.question-> Reflection02
 * @description: 测试性能
 * @author: cqh
 * @createDate: 2021-06-17 19:32
 * @version: 1.0
 * @todo:
 */
public class Reflection02 {

    public static void main(String[] args) throws Exception {
        method1();
        method2();
        method3();
    }
    public static void method1(){
        // 传统方法
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 900000000; i++){
            cat.hello();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法耗时时间: " + (end-start));
    }

    public static void method2() throws Exception{
        // 反射机制
        Class<?> cls = Class.forName("haige.Cat");
        Object o = cls.newInstance();
        Method clsMethod = cls.getMethod("hello");
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 900000000; i++){
            clsMethod.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射方法耗时时间: " + (end-start));

    }

    public static void method3() throws Exception{
        // 优化 关闭访问检查
        // 反射机制
        Class<?> cls = Class.forName("haige.Cat");
        Object o = cls.newInstance();
        Method clsMethod = cls.getMethod("hello");
        // 取消访问检测
        clsMethod.setAccessible(true);

        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 900000000; i++){
            clsMethod.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("优化反射方法耗时时间: " + (end-start));
    }
}
