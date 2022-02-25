package com.leetcode;

// question no 344

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String[] s ={"a","k","g","d","t"};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }

    static void reverse(String[] s){
        if(s == null || s.length <= 1)
            return;
        for (int i = 0; i < s.length/2; i++) {
            String ch = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = ch;
        }
    }
}
