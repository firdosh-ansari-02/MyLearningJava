package com.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(reverse(1));
    }
    static int reverse(int n){
        int count = (int)(Math.log10(n)) + 1;
        return helper(n,count);
    }

    private static int helper(int n, int count) {
        if(n%10 == n)
            return n;
        int rem = n%10;
        return rem * (int)(Math.pow(10,count-1)) + helper(n/10,count-1);
    }
}
