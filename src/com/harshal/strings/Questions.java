package com.harshal.strings;

public class Questions {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("code"));
        System.out.println(shortestPath("WNEENESENNN"));
        compressString("aaaabbbbbccddddd");
        compressString("abc");
    }

    public static boolean isPalindrome(String word){
        for(int i=0; i<word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static double shortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char direction = path.charAt(i);
            if(direction == 'E'){
                x++;
            } else if (direction == 'W') {
                x--;
            } else if (direction == 'N') {
                y++;
            }else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return Math.sqrt(X2 + Y2);
    }

    // time complexity = O(n) as in both loop only i is changing
    public static void compressString(String str){
        StringBuilder compressedString = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            Integer counter = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                counter++;
                i++;
            }
            if(counter>1)
                compressedString.append(str.charAt(i)).append(counter);
            else
                compressedString.append(str.charAt(i));
        }
        System.out.println(compressedString);
    }
}
