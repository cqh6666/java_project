package com.haige.thinkinjava.arrayslearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @className: com.haige.thinkinjava-> Gerbil
 * @description: Array ex2
 * @author: cqh
 * @createDate: 2021-06-28 14:15
 * @version: 1.0
 * @todo:
 */
public class Gerbil {

    private String name;
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public Gerbil(String name, int gerbilNumber) {
        this.name = name;
        this.gerbilNumber = gerbilNumber;
    }

    public String getName() {
        return name;
    }

    public int getGerbilNumber() {
        return gerbilNumber;
    }

    public void hop(){
        System.out.println("the number is:" + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(100));
        gerbils.add(new Gerbil(101));
        gerbils.add(new Gerbil(102));
        // get 使用
        gerbils.get(0).hop();

        // iterator 使用
        Iterator<Gerbil> iterator = gerbils.iterator();
        while(iterator.hasNext()){
            iterator.next().hop();
        }

        ArrayList<Gerbil> gerbils2 = new ArrayList<>();
        gerbils2.add(new Gerbil("a",100));
        gerbils2.add(new Gerbil("b",101));
        gerbils2.add(new Gerbil("c",102));
        // Map put
        HashMap<String, Integer> GerbilMap = new HashMap<String, Integer>();
        Iterator<Gerbil> iterator2 = gerbils2.iterator();
        while(iterator2.hasNext()){
            Gerbil next = iterator2.next();
            GerbilMap.put(next.getName(),next.getGerbilNumber());
        }



    }


}
