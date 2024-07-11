package com.harshal.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5,4,1,3,2};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
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
}
