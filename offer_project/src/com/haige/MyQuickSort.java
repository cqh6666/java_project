package com.haige;

import org.junit.Test;

import java.awt.geom.QuadCurve2D;
import java.lang.reflect.Array;
import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 * @className: com.haige-> MyQuickSort
 * @description:
 * @author: cqh
 * @createDate: 2021-06-18 15:05
 * @version: 1.0
 * @todo:
 */
public class MyQuickSort {

    public int[] array = {6,4,5,7,9,3,8};

    public static int partition(int[] data, int length, int start, int end){

        if(data==null || length<=0 || start<0 || end>=length){
            throw new InvalidParameterException("Invalid Parameters");
        }

        int index = start;
        int flagNum = data[index];

        while(start<=end){
            while(start<=end && data[end]>=flagNum){
                end--;
            }
            if(start<=end){
                data[start++] = data[end];
            }

            while(start<=end && data[start]<=flagNum){
                start++;
            }
            if(start<=end){
                data[end--] = data[start];
            }
        }
        data[start] = flagNum;
        return start;


    }

    public static void QuickS(int[] data, int start, int end){

        if (start>end){
            return;
        }

        int i,j,temp,t;

        i = start;
        j = end;
        temp = data[i];

        while(i<j){
            while(temp<=data[j] && i<j){
                j--;
            }

            while(temp>=data[i] && i<j){
                i++;
            }

            if(i<j){
                t = data[i];
                data[i] = data[j];
                data[j] = t;
            }
        }

        data[start] = data[i];
        data[i] = temp;

        QuickS(data, start,  -1);
        QuickS(data, j+1, end);
    }

    @Test
    public void test(){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        QuickS(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
