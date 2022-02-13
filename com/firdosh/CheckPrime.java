package com.firdosh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int input = in.nextInt();
        System.out.println(isPrime(input));
    }

    static boolean isPrime(int input) {
            if (input <= 1) {
                return false;
            }
            int c = 2;
            if (c * c <= input) {
                if (input % c == 0) {
                    return false;
                }
                c++;
            }
            return c * c > input;
        }
}
