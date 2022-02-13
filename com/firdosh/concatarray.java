package com.firdosh;

import java.util.Arrays;
import java.util.Scanner;

public class concatarray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i <a ; i++) {
            arr[i]= in.nextInt();

        }
        System.out.println(concat(arr, a));
    }

    static int[] concat(int[] arr,int size){
        int[] a = new int[2*size];
        for (int i = 0; i <2*size; i++) {
            a[i]=arr[i%size];
        }
        return a;
    }
}
