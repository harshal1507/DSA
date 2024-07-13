package com.harshal.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5,4,1,3,2};
        int[] arrDescending = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(numbers);
        bubbleSortDescending(arrDescending);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(arrDescending));

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

    public static void bubbleSort(int[] numbers){
        for (int turn = 0; turn < numbers.length-1; turn++) {
            for (int j = 0; j < numbers.length-1-turn; j++) {
                if(numbers[j] > numbers[j+1]){
                    swap(numbers,j,j+1);
                }
            }
        }
    }

    public static void bubbleSortDescending(int[] arr){
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int flag = 0;
            for (int j = 0; j < arr.length - turn -1; j++) {
                if(arr[j] < arr[j+1]){
                    swap(arr,j,j+1);
                    flag = 1;
                }
            }
            if (flag==0) break;
        }
    }
}
