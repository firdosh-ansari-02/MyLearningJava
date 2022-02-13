package com.firdosh;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = in.nextInt();
        System.out.println(isArm(n));
    }

    static boolean isArm(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;
        }
        return sum == original;

    }
}