package haige.reflection.question;

import haige.Cat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @className: haige.reflection.question-> ReflectionQuestion
 * @description: 反射问题的引入
 * @author: cqh
 * @createDate: 2021-06-17 16:22
 * @version: 1.0
 * @todo:
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //根据配置文件指定信息，创建Cat对象并调用方法hello

        //传统方式 new对象
        System.out.println("==============传统方法==============");
        Cat cat = new Cat();
        cat.hello();
        System.out.println("==============利用反射机制==============");

        // 1. Properties类
        Properties properties = new Properties();
        properties.load(new FileInputStream("first_learn\\src\\re.properties"));
        String classFullPath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classFullPath = " + classFullPath);
        System.out.println("methodName = " + methodName);

        // 创建对象,传统方法行不通
        // 设计模式的OCP原则：不修改源码，扩展功能
        // 使用反射机制解决

        // 2. 使用反射机制解决
        //  (1)加载类 返回Class类型的对象
        Class cls = Class.forName(classFullPath);
        //  (2)通过cls 得到你加载的类的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型 = "+o.getClass());
        //  (3)通过 cls 得到你加载的类 的 methodName 的方法对象 ========= 在反射中，可以把方法视为对象
        Method method = cls.getMethod(methodName);
        System.out.println("method = "+method);
        //  (4)通过method调用方法：即通过方法对象来实现调用
        System.out.println("==============调用反射==============");
        method.invoke(o);


    }
}
