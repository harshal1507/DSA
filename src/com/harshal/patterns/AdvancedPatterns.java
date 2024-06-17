package com.harshal.patterns;

public class AdvancedPatterns {
    public static void main(String[] args) {
        hollowPattern(4, 5);
        System.out.println();
        invertedAndRotatedPyramidPattern1(5);
        System.out.println();
        invertedAndRotatedPyramidPattern2(5);
        System.out.println();
        invertedHalfPyramidPattern(5);
        System.out.println();
        floydPattern(5);
        System.out.println();
        zeroOneTriangle(5);
        System.out.println();
        butterflyPattern(5);
        System.out.println();
        solidRhombusPattern(5);
        System.out.println();
        hollowRhombusPattern(5);
        System.out.println();
        diamondPattern(5);
    }

    public static void hollowPattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedPyramidPattern1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num-i); j++) {
                System.out.print(" ");
            }
            for (int j = num-i+1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedPyramidPattern2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydPattern(int num) {
        int number = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (num-i)*2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (num-i)*2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombusPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num -i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombusPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num -i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                if(i == 1 || i == num || j == 1 || j == num){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}