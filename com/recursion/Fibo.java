package com.recursion;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n = in.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2)
            return n;
        return fibo(n-1) + fibo(n-2);
    }
}
