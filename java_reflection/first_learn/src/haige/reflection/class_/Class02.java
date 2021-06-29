package haige.reflection.class_;

import haige.Cat;

import java.lang.reflect.Field;

/**
 * @className: haige.reflection.class_-> Class02
 * @description: 演示Class类的常用方法
 * @author: cqh
 * @createDate: 2021-06-17 20:12
 * @version: 1.0
 * @todo:
 */
public class Class02 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        String classAllPath = "haige.Cat";
        Class<?> cls = Class.forName(classAllPath);

        System.out.println(cls);                        // cls对象 哪个类的类对象
        System.out.println(cls.getClass());             // cls运行类型
        System.out.println(cls.getPackage().getName()); // 包名
        System.out.println(cls.getName());              // 全类名

        Cat cat = (Cat)cls.newInstance();
        System.out.println(cat);                        // toString()
        Field ageField = cls.getField("age");     // 通过反射获取属性"age" 公有属性
        System.out.println(ageField.get(cat));
        ageField.set(cat, 3);                         // 通过反射给属性赋值
        System.out.println(ageField.get(cat));

        //得到所有字段属性
        System.out.println("==============所有(公有)字段属性===============");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
