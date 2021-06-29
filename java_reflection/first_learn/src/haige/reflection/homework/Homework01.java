package haige.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @className: haige.reflection.homework-> Homework01
 * @description:
 * @author: cqh
 * @createDate: 2021-06-17 22:30
 * @version: 1.0
 * @todo:
 */
public class Homework01 {

    public static void main(String[] args) throws Exception{
        // 通过反射修改私有成员变量

        Class<?> pclass = Class.forName("haige.reflection.homework.PrivateTest");
        Object o = pclass.newInstance();
        Field nameField = pclass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(o, "noketty");
        Method getNameMethod = pclass.getMethod("getName");
        Object invoke = getNameMethod.invoke(o);
        System.out.println(invoke);
    }

}


class PrivateTest{
    private String name = "helloketty";
    public String getName(){
        return name;
    }
}
