package haige.reflection.classloader;

/**
 * @className: haige.reflection.classloader-> ClassLoader02
 * @description:
 * @author: cqh
 * @createDate: 2021-06-17 21:28
 * @version: 1.0
 * @todo:
 */
public class ClassLoader02 {
    public static void main(String[] args) {
        System.out.println(B.num);
    }

}


class B{

    static {
        System.out.println("静态代码块被执行");
        num = 300;
    }
    static int num = 100;

    public B() {
//        B.num = 200;
        System.out.println("构造器被执行");
    }
}