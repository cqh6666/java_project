package haige.reflection.utils;

import java.lang.reflect.Constructor;
import java.sql.Statement;

/**
 * @className: haige.reflection.utils-> CreateInstance
 * @description: 创建实例
 * @author: cqh
 * @createDate: 2021-06-17 22:06
 * @version: 1.0
 * @todo:
 */
public class CreateInstance {

    public static void main(String[] args) throws Exception{
        Class<?> catClass = Class.forName("haige.Cat");

        // public无参
        Object o = catClass.newInstance();
        System.out.println(o);

        // public 有参
        Constructor<?> constructor = catClass.getConstructor(String.class);
        Object o1 = constructor.newInstance("懒觉猫");
        System.out.println(o1);

        //通过非public的有参构造器
        Constructor<?> declaredConstructor = catClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);  // 爆破
        Object o2 = declaredConstructor.newInstance(2, "鸡鸡猫");
        System.out.println(o2);

    }
}
