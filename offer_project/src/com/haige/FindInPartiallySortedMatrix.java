package com.haige;

/**
 * @className: com.haige-> FindInPartiallySortedMatrix
 * @description: 03 二维数组的查找
 * @author: cqh
 * @createDate: 2021-06-15 22:30
 * @version: 1.0
 * @todo:
 */
public class FindInPartiallySortedMatrix {


    public static void main(String[] args) {
        
    }

    public static boolean solution(int[][] matrix, int number){

        int lengthX = matrix.length;
        int lengthY = matrix[0].length;

        int i = 0, j = lengthY - 1;

        while(i<lengthX && j>=0){
            if(matrix[i][j]==number){
                return true;
            }else if(matrix[i][j]>number){
                j--;
            }else{
                i++;
            }
        }

        return false;
    }
}
