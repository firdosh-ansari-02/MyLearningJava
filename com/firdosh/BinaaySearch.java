package com.firdosh;

import java.util.Scanner;

public class BinaaySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the elements to be searched");
        int target = in.nextInt();
        System.out.println(binary(arr,target));
    }

    static boolean binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            if(arr[0]<arr[arr.length-1]) {
               // int mid = start + (end - start) / 2;

                if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else
            if (arr[mid] > target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
