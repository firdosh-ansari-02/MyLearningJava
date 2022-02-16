package com.firdosh;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

        int[] arr = {2,4,5,2,4,5,6};
        System.out.println(unique(arr));

        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
//        if((n>>1)<<1==n)
//            System.out.println("Even");
//        else
//            System.out.println("Odd");
//
        System.out.println("Enter b value");
        int b = in.nextInt();

        System.out.println("Before swap");
        System.out.println(a +" "+b);

        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a+ " " +b);



    }

    private static int unique(int[] arr) {
        int unique = 0;
        for(int n : arr)
            unique ^= n;
        return unique;
    }


}
