package com.arydz.codility.countingelements.learning;

import java.util.Arrays;

public class SwapOperation {

    //O(n^2)
    public static boolean slowSolution(int[] a, int[] b, int max) {
        int n = a.length;
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int change = b[j] - a[i];
                sumA += change;
                sumB -= change;
                if (sumA == sumB) {
                    return true;
                }
                sumA -= change;
                sumB += change;
            }
        }
        return false;
    }

    //O(n+m)
    public static boolean fastSolution(int[] a, int[] b, int max) {
        int n = a.length;
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        int difference = sumB - sumA;
        if (difference % 2 == 1) {
            return false;
        }
        int[] count = counting(a, max);
        for (int i = 0; i < n; i++) {
            if (0 <= b[i] - difference && b[i] - difference <= max && count[b[i] - difference] > 0) {
                return true;
            }
        }
        return false;
    }

    private static int[] counting(int[] a, int max) {
        int[] p = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            p[a[i]] += 1;
        }
        return p;
    }
}
