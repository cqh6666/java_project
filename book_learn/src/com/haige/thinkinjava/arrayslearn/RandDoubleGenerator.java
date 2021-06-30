package com.haige.thinkinjava.arrayslearn;

import java.util.ArrayList;
import java.util.Random;

/**
 * @className: com.haige.thinkinjava-> RandDoubleGenerator
 * @description: Array ex1
 * @author: cqh
 * @createDate: 2021-06-28 14:11
 * @version: 1.0
 * @todo:
 */
public class RandDoubleGenerator {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList arrayList = new ArrayList<Double>();
        arrayList.add(random.nextDouble());
        arrayList.add(random.nextDouble());

        System.out.println(arrayList);
    }
}
