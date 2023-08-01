package com.harshal.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // initialization
        ArrayList<Integer> arr = new ArrayList<>(5);

        // input
        for(int i=0; i < 5; i++){
            arr.add(scanner.nextInt());
        }

        // output -- it automatically calls the to string method
        System.out.println(arr);

        /* List of list */
        // In below case for addition of elements initialization is mandatory
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        // input
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                list.get(row).add(scanner.nextInt());
            }
        }

        // output
        // input
        for(int row=0; row<list.size(); row++){
            System.out.print(list.get(row));
            System.out.println();
        }
    }
}
