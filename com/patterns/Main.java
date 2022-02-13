package com.patterns;

public class Main {
    public static void main(String[] args) {
        patthen4(3);
    }

    static void patthen1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patthen2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void patthen3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row +1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patthen4(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalcol = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
