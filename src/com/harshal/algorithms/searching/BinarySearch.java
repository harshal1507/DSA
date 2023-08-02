package com.harshal.algorithms.searching;

public class BinarySearch {
    public static void main(String[] args) {
        // sorted array is required
        int[] arr = {12, 35, 43, 65,  354, 456};
        int[] descArr = {456, 354, 65, 43, 35, 12};
        int target = 65;

        System.out.println(binarySearch(arr, target));
        System.out.println(orderAgnosticBinarySearch(descArr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            // int mid = (start + end)/2;
            // optimized mid calculation
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }else { // arr[mid] < target
                    start = mid + 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid - 1;
                }else { // arr[mid] > target
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
