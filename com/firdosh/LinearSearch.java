package com.firdosh;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element to searched");
        int target = in.nextInt();
        System.out.println(linear(arr,target));
    }

    static boolean linear(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
           // int element = arr[i];
            if(arr[i]==target)
                return true;
        }
        return false;
    }
}
