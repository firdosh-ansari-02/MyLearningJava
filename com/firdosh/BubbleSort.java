package com.firdosh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
            bubblesort(arr,n);
            System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr,int n){
        for (int i = 0; i <n; i++) {

            for (int j = 1; j < n-i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }
    }
}
