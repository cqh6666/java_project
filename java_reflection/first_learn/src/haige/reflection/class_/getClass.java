package haige.reflection.class_;

import haige.Cat;

/**
 * @className: haige.reflection.class_-> getClass
 * @description: 演示得到Class对象的各种方式
 * @author: cqh
 * @createDate: 2021-06-17 20:35
 * @version: 1.0
 * @todo:
 */
public class getClass {

    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取
         * 应用场景：多用于配置文件,读取类全路径，加载类
          */
        String classAllPath = "haige.Cat";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        /**
         * 已知具体的类，通过类的class获取，该方式最为安全可靠，程序性能最高
         * 应用场景： 多用于参数构造，比如通过反射得到对应构造器对象
         */
        Class cls2 = Cat.class;
        System.out.println(cls2);

        /**
         * 已知某个类的实例，调用该实例的getClass()方法获取Class对象
         * 应用场景：通过创建好的对象，获取Class对象
         */
        Cat cat = new Cat();
        Class<? extends Cat> cls3 = cat.getClass();
        System.out.println(cls3);

        /**
         * 通过类加载器获取Class对象
         * 1. 类加载器
         * 2. Class对象
         */
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        // 全部获得的对象都是同一个
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

    }
}
