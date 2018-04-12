package com.arydz.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int factor = (X * (X +1) / 2);
        Set<Integer> presentLeafs = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (presentLeafs.add(A[i])) {
                sum += A[i];
            }
            if (sum == factor) {
                return i;
            }
        }
        return -1;
    }
}
