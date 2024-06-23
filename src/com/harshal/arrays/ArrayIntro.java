package com.harshal.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* Array of primitive */

        // declaration
        int[] numericArray;

        // initialization with null values in heap memory
        numericArray = new int[5];

        // take input in array
        for (int i=0; i<numericArray.length; i++){
            numericArray[i] = scanner.nextInt();
        }

        // print output of array
        for (int i=0; i<numericArray.length; i++){
            System.out.print(numericArray[i] + ", ");
        }

        System.out.println();

        // using enhanced for loop
        for (int element : numericArray) {
            System.out.print(element + ", ");
        }

        changeArray(numericArray);

        // print output using Array class
        System.out.println(Arrays.toString(numericArray));

        /* Array of objects */

        String[] stringArray = new String[3];

        for (int i=0; i<stringArray.length; i++){
            stringArray[i] = scanner.next();
        }

        System.out.println(Arrays.toString(stringArray));

        // we can modify array also as below
        stringArray[1] = "data structures";

        System.out.println(Arrays.toString(stringArray));

    }
    // this function will change original array as both reference variable points to same array
    // pass by reference example
    static void changeArray(int[] arr){
        arr[0] = 99;
    }
}
