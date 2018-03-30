package com.arydz.codility.arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0 ; i < A.length; i++) {
            int position = (i + K) < A.length ? (i + K) : (i + K) % A.length;
            result[position] = A[i];
        }
        return result;
    }
}
