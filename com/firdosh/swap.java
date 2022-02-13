package com.firdosh;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = in.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < a; i++) {
            arr[i]= in.nextInt();

        }
        reverse(arr);
        System.out.println(Arrays.toString((arr)));
    }


    static void reverse(int[] arr){
        int start =0;
        int end =arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] a,int start,int end){
        int temp = a[start];
        a[start]=a[end];
        a[end]=temp;
    }
}
