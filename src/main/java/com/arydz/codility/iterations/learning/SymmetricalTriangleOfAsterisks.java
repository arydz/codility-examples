package com.arydz.codility.iterations.learning;

public class SymmetricalTriangleOfAsterisks {

    public void print(int n) {
        for (int i = n ; i > 0; i--) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
