package com.harshal.arrays.practice_questions;

import java.util.HashSet;

public class check_duplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(isDuplicatePresent1(arr));
        System.out.println(isDuplicatePresent2(arr));
        System.out.println(isDuplicatePresent3(arr));
    }

    // below method will not work for constraint
    // 1 <= numbers.length <= 10 raise to power 5
    // -10 raise to power 9 <= numbers[i] <= 10 raise to power 9
    // as we are maintaining count array
    public static boolean isDuplicatePresent1(int[] arr){
        int maxElement = findMax(arr);
        int[] countArray = new int[maxElement+1];

        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        for (int i = 0; i < countArray.length; i++) {
            if(countArray[i]>1){
                return true;
            }
        }
        return false;
    }

    // brute force
    public static boolean isDuplicatePresent2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    // optimized using sets
    public static boolean isDuplicatePresent3(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static int findMax(int[] arr){
        if(arr == null) return -1;
        if(arr.length == 0) return -1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
