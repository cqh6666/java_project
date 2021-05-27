package com.haige.collectionapi.equalmethod;

/**
 * @className: com.haige.collectionapi.equalmethod-> Compare
 * @description: 利用hashCode比较
 * @author: cqh
 * @createDate: 2021-05-27 10:26
 * @version: 1.0
 * @todo:
 */
public class Compare {
    public static void main(String[] args) {
        String name = "海鸽";
        String name2 = "海鸽";
        User user = new User(name, 15);
        User user2 = new User(name2, 15);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user.hashCode() == user2.hashCode());


        User user3 = user;

        System.out.println(user.equals(user3));
        System.out.println(user3.equals(user));



    }
}
