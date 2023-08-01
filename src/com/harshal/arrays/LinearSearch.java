package com.harshal.arrays;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 43, 35, 456, 65, 354};
        int target = 35;

        String name = "algorithms";
        char targetCharacter = 'i';

        System.out.println(searchIndex(arr,target));
        System.out.println(searchElement(arr,target));
        System.out.println(search(arr,target));
        System.out.println(searchIndexInRange(arr,target,1,4));
        System.out.println(minimumElementInArray(arr));
        System.out.println(searchCharacter(name, targetCharacter));
        System.out.println(searchCharacterUsingForEach(name, targetCharacter));
    }

    static int searchIndex(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int searchIndexInRange(int[] arr, int target, int startIndex, int endIndex){
        for(int i=startIndex; i<=endIndex; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int searchElement(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }

    static boolean search(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static int minimumElementInArray(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int searchCharacter(String stringArray, char targetCharacter){
        for (int i = 0; i < stringArray.length(); i++) {
            if(targetCharacter == stringArray.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    static boolean searchCharacterUsingForEach(String stringArray, char targetCharacter){

        if(stringArray.length() == 0){
            return false;
        }

        for (char character: stringArray.toCharArray()) {
            if(targetCharacter == character){
                return true;
            }
        }
        return false;
    }
}
