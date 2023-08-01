package com.harshal.arrays;

public class LeetCode {
    public static void main(String[] args) {
        int[] numbers = {12,345,2,6,7896};

        // 1672. Richest Customer Wealth leet code problem
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
            };

        System.out.println(findNumbers(numbers));
        System.out.println(maximumWealth(accounts));
    }

    static int findNumbers(int[] numbers) {

        if(numbers == null){
            return 0;
        }

        if(numbers.length == 0){
            return 0;
        }

        int countOfEvenDigitNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(countNumbersUsingLog(numbers[i])%2 == 0){
                countOfEvenDigitNumbers++;
            }
        }
        return countOfEvenDigitNumbers;
    }

    static int countNumbers(int number){
        int count = 0;
        while(number > 0){
            number = number/10;
            count++;
        }
        return count;
    }

    // optimized method to count number of digits
    static int countNumbersUsingLog(int number){
        return (int)(Math.log10(number)) + 1;
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int row = 0; row < accounts.length; row++) {
            int sum = findSum(accounts[row]);
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    static int findSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
