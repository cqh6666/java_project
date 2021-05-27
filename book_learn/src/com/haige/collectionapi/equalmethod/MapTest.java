package com.haige.collectionapi.equalmethod;

import java.util.HashMap;

/**
 * @className: com.haige.collectionapi.equalmethod-> MapTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 12:37
 * @version: 1.0
 * @todo:
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("haige",42);
        scores.put("haige2",43);
        scores.put("haige3",44);
        scores.put("haige3",43);

        System.out.println(scores);
        System.out.println(scores.get("haige"));
    }
}
