package com.arydz.codility.timecomplexity;

public class PermMissingElem {

    public int solution(int[] A) {
        long n = A.length;
        long expectedSum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0 ; i < n; i++) {
            expectedSum -= A[i];
        }
        return (int) expectedSum;
    }
}
