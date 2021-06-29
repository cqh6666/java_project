package haige.reflection.utils;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @className: haige.reflection.utils-> ReflectionUtils
 * @description:
 * @author: cqh
 * @createDate: 2021-06-17 21:38
 * @version: 1.0
 * @todo:
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void api01() throws ClassNotFoundException {
        // 得到CLass对象
        Class<?> personCls = Class.forName("haige.reflection.utils.Person");

        //1. getName：获取全类名
        System.out.println(personCls.getName());
        //2. getSimpleName：获取简单类名
        System.out.println(personCls.getSimpleName());
        //3. getFields：获得所有public访问权限的属性，包括本类及父类的属性
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("本类及父类public属性: " + field.getName());
        }
        //4. getDeclaredFields：获得本类中的所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("各属性: " + declaredField.getName());
        }
        //5. getMethods：获得public访问权限的方法，包括本类及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类及负类所有方法： "+ method.getName());
        }
        //6. getDeclaredMethods：获得本类中的所有方法
        //7. getConstructors：获取本类中所有public访问权限的构造器
        //8. getDeclaredConstructors：获取本类中的所有构造器
        //9. getPackage：以Package形式返回包的信息
        //10. getSuperClass：以Class形式返回父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println("父类： "+superclass.getName());
        //11. getInterface：以Class[] 形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口: "+anInterface);
        }
        //12. getAnnotations：以Annotation[]形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解： "+ annotation);
        }

    }

    @Test
    public void api02() throws ClassNotFoundException {
        // 得到CLass对象
        Class<?> personCls = Class.forName("haige.reflection.utils.Person");

        //getDeclaredFields：获得本类中的所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        // 默认修饰值 0 [public,private,protected,static,final] = {1,2,4,8,16}
        for (Field declaredField : declaredFields) {
            System.out.println("本类所有属性= " + declaredField.getName()
                    + " 该属性的修饰值= "+ declaredField.getModifiers()
                    + " 该属性的类型= " + declaredField.getType());
        }


    }
}

class A{
    public String hobby;
}

interface Ia{
}

interface Ib{

}

@Deprecated
class Person extends A implements Ia,Ib{
    public String name;
    protected int age;
    String job;
    private double sal;

    public void m1(){

    }
    protected void m2(){

    }
    void m3(){

    }
    private void m4(){

    }

}