package com.recursion;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digits");
        int n = in.nextInt();
        System.out.println(sum(n));
    }

    private static long sum(int n) {
        if(n == 0)
            return n;
        return ((n % 10)) + sum(n / 10);
    }
}
