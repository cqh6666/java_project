package com.haige.collectionapi.equalmethod;

import java.util.TreeSet;

/**
 * @className: com.haige.collectionapi.equalmethod-> TreeSetTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 12:30
 * @version: 1.0
 * @todo:
 */
public class TreeSetTest {
    public static void main(String[] args) {
        new TreeSetTest().go();
    }

    public void go(){
        User user = new User("华哥",12);
        User user2 = new User("海哥",15);

        TreeSet<User> tree = new TreeSet<User>();
        tree.add(user);
        tree.add(user2);
        tree.add(user);
        System.out.println(tree);


    }
}
