package com.harshal.arrays.practice_questions;

public class sorted_and_rotated_array {
    public static void main(String[] args) {
        int[] sortedRotatedArray = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findElementInSortedRotatedArray(sortedRotatedArray, 0));
    }

    public static int findElementInSortedRotatedArray(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;

            // target is middle element
            if(target == arr[mid]) return mid;

                // left sorted
            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target < arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                // right sorted
                if(arr[mid] < target && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
