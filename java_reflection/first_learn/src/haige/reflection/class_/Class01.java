package haige.reflection.class_;

import haige.Cat;

/**
 * @className: haige.reflection.class_-> Class01
 * @description: 对象反射机制
 * @author: cqh
 * @createDate: 2021-06-17 19:53
 * @version: 1.0
 * @todo:
 */
public class Class01 {

    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * loadClass
         * public Class<?> loadClass(String name) throws ClassNotFoundException {
         *         return loadClass(name, false);
         *     }
         */
        // 传统new 对象
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());
        // 反射
        Class<?> aClass1 = Class.forName("haige.Cat");
        Class<?> aClass2 = Class.forName("haige.Cat");
        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());

    }
}
