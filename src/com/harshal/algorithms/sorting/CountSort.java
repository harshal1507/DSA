package com.harshal.algorithms.sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,10,15,6,8,12,3,6};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr){
        // 1. find max
        int maxNo = max(arr);

        // 2. initialize array, max + 1 as we have to include zero also and initialize with zero
        int[] countArray = new int[maxNo+1];

        // 3. maintain count
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        // 4. sorting
        int j = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0){
                arr[j] = i;
                countArray[i]--;
                j++;
            }
        }
    }

    public static int max(int[] arr){

        if(arr == null){
            return -1;
        }

        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    };
}
