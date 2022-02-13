package com.firdosh;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println(magicnum(n));
    }

    private static int magicnum(int n) {
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }
}
