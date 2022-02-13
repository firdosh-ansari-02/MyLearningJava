package com.firdosh;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int a = in.nextInt();
////        String [] arr = new String[a];
//        System.out.println("Enter the elements in tha array");
//        for (int i = 0; i <a ; i++) {
//            arr[i] = in.next();
//        }
////        for (int i = 0; i < a; i++) {
////            System.out.print(arr[i]+" ");
//
////        System.out.println(Arrays.toString(arr));
//
//        for(String str : arr)
//            System.out.print(str+" ");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int[] a : arr)
            System.out.println(Arrays.toString(a));
    }
}
