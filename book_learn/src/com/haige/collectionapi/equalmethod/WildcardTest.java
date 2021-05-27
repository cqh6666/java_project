package com.haige.collectionapi.equalmethod;

import java.util.ArrayList;

/**
 * @className: com.haige.collectionapi.equalmethod-> WildcardTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 12:47
 * @version: 1.0
 * @todo:
 */
public class WildcardTest {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        takeAnimals(cats);

        System.out.println("=======================");
        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Animals());
        takeAnimals(animals);


    }


    public static void takeAnimals(ArrayList<? extends Animals> animals){
        /**
         * public void takeAnimals(ArrayList<? extends Animals> animals) 相当于
         * public <T extends Animals> void takeAnimals(ArrayList<T> animals)
         * @param animals
         */
        //当参数是 万用字符?时，系统会阻止任何可能破坏引用参数所指集合的行为
        //animals.add(new Cat());
        for(Animals a:animals){
            a.eat();
        }
    }
}
