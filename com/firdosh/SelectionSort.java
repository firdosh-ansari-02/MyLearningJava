package com.firdosh;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = maxIndex(arr,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr,int max,int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    //{3,5,1,7,5}
    static int maxIndex(int[] arr,int end){
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
