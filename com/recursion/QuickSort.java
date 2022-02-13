package com.recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,6,78,1,4};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr,int low,int hi){
        if(low >= hi)
            return;

        int s = low;
        int e = hi;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s <= e) {

            while (arr[s] < pivot)
                s++;
            while (arr[e] > pivot)
                e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hi);
    }
}
