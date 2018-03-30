package com.arydz.codility.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Arrays.sort(A);
        int result = A[A.length -1];
        for (int i = 0; i < A.length - 1; i += 2) {
            if (A[i] != A[i + 1]) {
                result = A[i];
                break;
            }
        }
        return result;
    }
}
