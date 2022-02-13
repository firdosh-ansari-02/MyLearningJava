package com.recursion;

import java.util.ArrayList;

public class Sorted {
    public static void main(String[] args) {
        int[] a = {2,4,16,8,8,9};
//        System.out.println(isSorted(a,0));
//        findAllIndex(a,8,0);
//        ArrayList<Integer> list = new ArrayList<>();
//        findAllIndex1(a,8,0,new ArrayList<>());
        System.out.println(findAllIndex1(a,8,0,new ArrayList<>()));

    }

    static boolean isSorted(int[] arr,int index){
        if(index == arr.length-1)
            return true;
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }

    static int findIndex(int[] arr,int target,int index){
        if(index == arr.length)
            return -1;
        if(arr[index] == target) {
            return index;
        } else {
            return findIndex(arr,target,index+1);
        }
    }

    static boolean find(int[] arr,int target,int index){
        if(index == arr.length)
            return false;
        return arr[index] == target || find(arr,target,index+1);
    }

//    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index) {
        if (index == arr.length)
            return;
        if (arr[index] == target) {
//            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }


    static ArrayList findAllIndex1(int[] arr,int target,int index,ArrayList list) {
        if (index == arr.length)
            return list;
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1,list);
    }

}
