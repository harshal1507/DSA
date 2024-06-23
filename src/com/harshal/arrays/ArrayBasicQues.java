package com.harshal.arrays;

import java.util.Arrays;

public class ArrayBasicQues {

    /*
    * 1. swap elements of array
    * 2. find max element of array
    * 3. find max element in a given range
    * 4. reverse array using swap function - optimized approach - without using another array
    *    and swap elements in same array, so TC will same and space complexity will be from O(n) to O(1)
    * 5. pairs in array
    *
    * Note - consider edge cases in all above problems
    *
    */
    public static void main(String[] args) {

        int[] arr = {12, 43, 35, 456, 65, 354};
        System.out.println(Arrays.toString(arr));

        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 2, 3));

        reverse(arr);
        System.out.println(Arrays.toString(arr));

        pairsInArray(arr);
    }

    static void swap(int[] arr, int firstIndex, int secondIndex){

        if(arr == null){
            return;
        }

        if(arr.length == 0){
            return;
        }

        if(firstIndex>secondIndex){
            return;
        }

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    static int max(int[] arr){

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
    }

    static int maxInRange(int[] arr, int startIndex, int endIndex){

        if(arr == null){
            return -1;
        }

        if(arr.length == 0){
            return -1;
        }

        if(startIndex>endIndex){
            return -1;
        }

        int max = arr[startIndex];
        for (int i = startIndex+1; i <= endIndex; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void reverse(int[] arr){

        if(arr == null){
            return;
        }

        if(arr.length == 0){
            return;
        }

        int firstIndex = 0;
        int lastIndex = arr.length-1;

        while (firstIndex<lastIndex){
            swap(arr, firstIndex, lastIndex);
            firstIndex++;
            lastIndex--;
        }
    }

    static void pairsInArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j=i+1; j<arr.length ; j++) {
                System.out.print("("+current+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
