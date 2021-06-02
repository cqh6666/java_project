package com.haige.diy;

/**
 * @className: com.haige.diy-> DiyPointCut
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 16:49
 * @version: 1.0
 * @todo:
 */
public class DiyPointCut {
    public void before(){
        System.out.println("执行前...");
    }

    public void after(){
        System.out.println("执行后...");
    }
}
