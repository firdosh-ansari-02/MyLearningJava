package com.firdosh;

public class BSFloorCeilingValue {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,22,33,44,55,66};
        System.out.println(floor(arr,77));
        System.out.println(ceiling(arr,2));
    }

    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target) end = mid - 1;
            else return arr[mid];
        }
        return arr[end % arr.length];
    }

    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target) end = mid - 1;
            else return arr[mid];
        }
        return arr[start % arr.length];
    }
}
