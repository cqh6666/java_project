package com.haige.thinkinjava.arrayslearn;

import sun.nio.cs.Surrogate;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

/**
 * @className: com.haige.arraylearn-> arrayTest
 * @description:
 * @author: cqh
 * @createDate: 2021-06-21 14:25
 * @version: 1.0
 * @todo:
 */
public class arrayTest {

    public static void main(String[] args) {
        int[] a = {1,2,3,5,4};
        int[] b = {14,3,2};

        // 填满
//        Arrays.fill(a,3);

        // toString 输出
        System.out.println(Arrays.toString(a));

        // 复制
        System.arraycopy(a,0, b ,0,b.length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.asList(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


    }


}
