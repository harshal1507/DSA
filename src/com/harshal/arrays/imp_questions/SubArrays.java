package com.harshal.arrays.imp_questions;

/*
 * Remember
 * start = 1st loop = i
 * end = 2nd loop = j
 */

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        printSubArrays(arr);
        System.out.println(printMinSubArraySum(arr));
        System.out.println(printMaxSubArraySum(arr));
        System.out.println(maxSubArraySum(arr));
        System.out.println(kadanes(arr));
    }

    public static void printSubArrays(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int printMaxSubArraySum(int[] numbers){
        int maximumSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                if(sum>maximumSum){
                    maximumSum = sum;
                }
            }
        }
        return maximumSum;
    }

    public static int printMinSubArraySum(int[] numbers){
        int minimumSum = Integer.MAX_VALUE;
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                if(sum<minimumSum){
                    minimumSum = sum;
                }
            }
        }
        return minimumSum;
    }

    // maximum sum using prefix sum array
    public static int maxSubArraySum(int[] numbers){
        int maximumSum = Integer.MIN_VALUE;
        int[] prefixSum = new int[numbers.length];
        int currentSum;
        prefixSum[0] = numbers[0];

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                currentSum = i==0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(currentSum > maximumSum)
                    maximumSum = currentSum;
            }
        }
        return maximumSum;
    }

    // Max sub array sum using Kadane's Algorithm
    public static int kadanes(int[] numbers){
        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if(currentSum < 0)
                currentSum = 0;
            else
                if(currentSum > maximumSum)
                    maximumSum = currentSum;
        }

        return maximumSum;
    }
}
