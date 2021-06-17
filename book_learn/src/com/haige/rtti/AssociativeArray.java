package com.haige.rtti;

import java.util.Arrays;

/**
 * @className: com.haige.rtti-> AssociativeArray
 * @description:
 * @author: cqh
 * @createDate: 2021-06-16 19:37
 * @version: 1.0
 * @todo:
 */
public class AssociativeArray {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length){
        pairs = new Object[length][2];
    }

    public void put(Object key, Object value){
        if (index>=pairs.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{key, value};
    }

    public Object get(Object key){
        for(int i=0;i<index;i++){
            if(key.equals(pairs[i][0])) {
                return pairs[i][1];
            }
        }
        throw new RuntimeException("Failed to find key");
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0;i<index;i++){
            result += pairs[i][0] + " : " + pairs[i][1];
            if(i<index-1) {
                result += "\n";
            }
        }
        return result;
    }

}
