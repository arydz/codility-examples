package com.arydz.codility.iterations.learning;

/**
 * Let’s print a triangle made of asterisks (‘*’) separated by spaces. The triangle
 * should consist of n rows, where n is a given positive integer, and consecutive rows should
 * contain 1, 2, . . . ,n asterisks. For example, for n = 4 the triangle should appear as follows:

 *
 * *
 * * *
 * * * *

 */
public class TriangleOfAsterisks {

    public void print(int n) {
        for (int i = 1 ; i <= n; i++ ) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
