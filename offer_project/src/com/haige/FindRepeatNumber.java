package com.haige;

import java.util.HashSet;
import java.util.Set;

/**
 * @className: com.haige-> FindRepeatNumber
 * @description: 03 数组中重复的数字
 * @author: cqh
 * @createDate: 2021-06-15 22:22
 * @version: 1.0
 * @todo:
 */
public class FindRepeatNumber {


    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        int result = solution(nums);
        System.out.println(result);
    }

    public static int solution(int[] nums) {

        // 集合
        Set hs = new HashSet();

        for(int i=0;i<nums.length;i++){
            if ( hs.contains(nums[i]) ){
                return nums[i];
            }else{
                hs.add(nums[i]);
            }
        }

        return -1;
    }


}
