package haige.reflection.homework;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @className: haige.reflection.homework-> Homework02
 * @description:
 * @author: cqh
 * @createDate: 2021-06-17 22:38
 * @version: 1.0
 * @todo:
 */
public class Homework02 {

    public static void main(String[] args) throws Exception{
        // 利用反射和File完成

        // 利用Class类的forName方法得到File类class对象
        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }

        //单独得到构造器public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        Object file = declaredConstructor.newInstance(".\\aa.txt"); // 创建File对象

        // 还得得到createNewFile的方法对象
        Method createNewFile = aClass.getMethod("createNewFile");
        createNewFile.invoke(file);

        System.out.println(file + " 创建文件成功");

    }
}
