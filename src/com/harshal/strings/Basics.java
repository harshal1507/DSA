package com.harshal.strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        /* Scanner sc = new Scanner(System.in);
        String name = sc.next(); // gets only single word
        String fullName = sc.nextLine(); // gets entire line
        System.out.println(name);
        System.out.println(fullName); */

        String fullName = "Tony Stark";
        System.out.println(fullName.length());

        // concatenation
        String firstName = "Harshal";
        String lastName = "Giri";
        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.charAt(1));
        printLetters("Programming");
        System.out.println();

        // string comparison
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        // substring
        String greetings = "HelloWorld";
        // using inbuilt function
        System.out.println(greetings.substring(0,5));
        // using defined function
        System.out.println(subString(greetings, 0, 5));
    }

    public static String subString(String str, int start, int end){
        String subStr = "";
        for (int i = start; i < end; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void printLetters(String word){
        for(int i=0; i<word.length(); i++){
            System.out.print(word.charAt(i) + " ");
        }
    }
}
