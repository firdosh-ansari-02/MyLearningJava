package com.leetcode;

// leetcode question no 198

public class HouseRobb {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(houseRob(arr));

    }

    static int houseRob(int[] arr){
        if(arr.length == 0)
            return -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sum += arr[i];
        }
        return sum;
    }
}
