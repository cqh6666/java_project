package com.haige.rtti;

import java.util.Random;

/**
 * @className: com.haige.rtti-> PetCount
 * @description:
 * @author: cqh
 * @createDate: 2021-06-16 19:44
 * @version: 1.0
 * @todo:
 */
public class PetCount {

    private static Random rand = new Random();
    static String[] typenames = {
            "Pet","Dog","Pug","Cat","Rodent","Gerbil","Hamster"
    };

    public static void main(String[] args) {
        Object[] pets = new Object[15];

        try{
            Class[] petTypes = {
                    Class.forName("com.haige.rtti.Dog"),
                    Class.forName("com.haige.rtti.Pug"),
                    Class.forName("com.haige.rtti.Cat"),
                    Class.forName("com.haige.rtti.Rodent"),
                    Class.forName("com.haige.rtti.Gerbil"),
                    Class.forName("com.haige.rtti.Hamster"),
            };
            // 随机创建生物
            for(int i=0;i< pets.length;i++){
                pets[i] = petTypes[rand.nextInt(petTypes.length)].newInstance();
            }
        }catch (InstantiationException e){
            System.out.println("Cannot instantiate");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("Cannot access");
            System.exit(1);
        }catch (ClassNotFoundException e){
            System.out.println("Cannot find class");
            System.exit(1);
        }

        // 7种生物
        AssociativeArray map = new AssociativeArray(typenames.length);
        for(int i=0;i< typenames.length;i++){
            map.put(typenames[i], new Counter());
        }
        // 15只生物 计数
        for(int i=0;i< pets.length;i++){
            Object o = pets[i];
            if(o instanceof Pet){
                ((Counter)map.get("Pet")).i++;
            }
            if(o instanceof Dog){
                ((Counter)map.get("Dog")).i++;
            }
            if(o instanceof Pug){
                ((Counter)map.get("Pug")).i++;
            }
            if(o instanceof Cat){
                ((Counter)map.get("Cat")).i++;
            }
            if(o instanceof Rodent){
                ((Counter)map.get("Rodent")).i++;
            }
            if(o instanceof Gerbil){
                ((Counter)map.get("Gerbil")).i++;
            }
            if(o instanceof Hamster){
                ((Counter)map.get("Hamster")).i++;
            }
        }

        for(int i=0;i<pets.length;i++){
            System.out.println(pets[i].getClass());
        }
        System.out.println("map:");
        System.out.println(map);



    }

}
