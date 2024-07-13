package com.harshal.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5,4,1,3,2};
        int[] arrDescending = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(numbers);
        selectionSortDescending(arrDescending);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(arrDescending));
    }

    public static void selectionSort(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            int minPosition = i;
            for (int j = i+1; j <= numbers.length-1; j++) {
                // if we change below operator condition then it will sort array in descending order
                if(numbers[minPosition] > numbers[j]){
                    minPosition = j;
                }
            }
            int temp = numbers[minPosition];
            numbers[minPosition] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void selectionSortDescending(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minPosition = i;
            for (int j = i+1; j <= arr.length-1; j++) {
                if(arr[minPosition] < arr[j]){
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }
}
