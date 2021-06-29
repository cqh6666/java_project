package haige.reflection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Properties;

/**
 * @className: haige.reflection.question-> Refilection01
 * @description: java.lang.reflect.Field
 * @author: cqh
 * @createDate: 2021-06-17 19:20
 * @version: 1.0
 * @todo:
 */
public class Reflection01 {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("first_learn\\src\\re.properties"));
        String classFullPath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();


        Class cls = Class.forName(classFullPath);
        Object o = cls.newInstance();
        System.out.println("o的运行类型 = "+o.getClass());
        Method method = cls.getMethod(methodName);
        System.out.println("method = "+method);
        System.out.println("==============调用反射==============");
        method.invoke(o);

        // java.lang.reflect.Field
        Field ageField = cls.getField("age");
        System.out.println(ageField);
        System.out.println("age : " + ageField.get(o));

        //java.lang.reflect.Constructor
        // 无参
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        // 有参
        Constructor constructor1 = cls.getConstructor(String.class);  // String.class
        System.out.println(constructor1);


    }
}
