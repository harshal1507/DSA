package com.harshal.patterns;

public class BasicPatterns {
    public static void main(String[] args) {
        starPattern(5);
        System.out.println();
        invertedStarPattern(5);
        System.out.println();
        halfPyramidPattern(5);
        System.out.println();
        characterPattern(5);
    }

    public static void starPattern(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedStarPattern(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidPattern(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void characterPattern(int num){
        char ch = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
