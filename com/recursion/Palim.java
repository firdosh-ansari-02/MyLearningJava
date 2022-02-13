package com.recursion;

import java.util.Locale;

public class Palim {
    public static void main(String[] args) {
//        System.out.println(isPalim("a"));
        System.out.println(count(2));

    }

    static boolean isPalim(String str){
        str =  str.toLowerCase();

        for (int i = 0; i <= str.length()/2; i++) {
           if(str.charAt(i) != str.charAt(str.length()-i-1))
               return false;
        }
        return true;

    }

    static int count(int n){
        return (int)(Math.log10(n)) + 1;
    }
}
