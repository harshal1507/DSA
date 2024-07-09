package com.harshal.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5,4,1,3,2};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void bubbleSort(int[] numbers){
        for (int turn = 0; turn < numbers.length-1; turn++) {
            for (int j = 0; j < numbers.length-1-turn; j++) {
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
