package haige;

/**
 * @className: haige-> Cat
 * @description:
 * @author: cqh
 * @createDate: 2021-06-17 16:20
 * @version: 1.0
 * @todo:
 */
public class Cat {

    private String name = "招财猫";
    public int age = 10;

    public Cat() {
    }


    public Cat(String name) {
        this.name = name;
    }

    private Cat(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void hello(){
//        System.out.println(name + " says hello!");
    }

    public void cry(){
        System.out.println(name +" is crying!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
