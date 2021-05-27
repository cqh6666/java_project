package com.haige.collectionapi.equalmethod;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @className: com.haige.collectionapi.equalmethod-> HashCodeTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 11:30
 * @version: 1.0
 * @todo:
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Collection set = new HashSet();

        User user = new User("haige", 14);
        User user1 = new User("haige", 15);
        set.add(user);
        set.add(user1);
        set.add(user);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
