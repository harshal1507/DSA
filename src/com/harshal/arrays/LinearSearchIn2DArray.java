package com.harshal.arrays;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {44, 67, 88, 100},
                {23, 36, 56 ,12, 133},
                {12, 34, 43}
        };

        int targetElement = 56;
        System.out.println(Arrays.toString(searchIn2DArray(arr, targetElement)));
        System.out.println(maxElement(arr));
    }

    static int[] searchIn2DArray(int[][] arr, int targetElement){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(targetElement == arr[row][col]){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int maxElement(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
