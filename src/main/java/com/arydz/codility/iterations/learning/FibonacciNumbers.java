package com.arydz.codility.iterations.learning;

public class FibonacciNumbers {

    public void printFibonacciNumbers(int n) {
        int a = 0;
        int b = 1;
        int c;
        while (a <= n) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
