package com.harshal.strings;

import java.util.Arrays;

public class PracticeQuestions {
    public static void main(String[] args) {
        String inputString = "Sheep";
        System.out.println(countVowels(inputString));

        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1) +" "+str.equals(str2));

        String str3="ApnaCollege".replace("l","");
        System.out.println(str3);

        String str4 = "race";
        String str5 = "care";
        System.out.println(checkAnagram(str4,str5));
    }

    public static int countVowels(String inputString){
        int vowelsCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == 'a'||  inputString.charAt(i) == 'e' ||
                    inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' ||
                    inputString.charAt(i) == 'u' || inputString.charAt(i) == 'A' ||
                    inputString.charAt(i) == 'E' || inputString.charAt(i) == 'I' ||
                    inputString.charAt(i) == 'O' || inputString.charAt(i) == 'U'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static boolean checkAnagram(String str4, String str5){
        boolean isAnagram = false;
        str4 = str4.toLowerCase();
        str5 = str5.toLowerCase();

        if(str4.length() == str5.length()){
            char[] charArray1 = str4.toCharArray();
            char[] charArray2 = str5.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if(Arrays.equals(charArray1, charArray2)){
                isAnagram = true;
            }
        }

        return isAnagram;
    }
}
