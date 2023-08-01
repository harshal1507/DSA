package com.harshal.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2D array
        // no. of rows is mandatory to specify
        // no. of columns is non-mandatory
        int[][] arr = new int[3][3];

        // declaration of 2d array
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int row=0; row<arr.length; row++){
            arr[row] = new int[3];
        }

        // input
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
             arr[row][col] = scanner.nextInt();
            }
        }

        // output
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + ", ");
            }
            System.out.println();
        }

        // output
        for(int row=0; row<arr.length; row++){
            System.out.print(Arrays.toString(arr[row]));
            System.out.println();
        }
    }
}
