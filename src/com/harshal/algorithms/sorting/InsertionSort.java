package com.harshal.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={8,5,7,3,2};
        int[] arrDescending = {3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr);
        Arrays.sort(arr);
        insertionSortDescending(arrDescending);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrDescending));
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int previous = i-1;
            int current = arr[i];
            // finding out correct position to insert
            while(previous >= 0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            // insertion
            arr[previous+1] = current;
        }
    }

    public static void insertionSortDescending(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int previous = i-1;
            int current = arr[i];
            while(previous>=0 && arr[previous] < current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
    }
}
