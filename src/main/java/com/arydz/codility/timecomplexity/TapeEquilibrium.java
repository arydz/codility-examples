package com.arydz.codility.timecomplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int result = Integer.MAX_VALUE;
        int totalSum = 0;
        int leftSum = 0;

        for (int i = 1; i < A.length; i++) {
            totalSum += A[i];
        }
        for (int i = 1; i < A.length; i++) {
            leftSum += A[i - 1];
            int difference = Math.abs(leftSum - totalSum);
            if (difference < result) {
                result = difference;
            }
            totalSum -= A[i];
        }
        return result;
    }
}
