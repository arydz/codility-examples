package com.arydz.codility.countingelements;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] != (i + 1)) {
                return 0;
            }
        }
        return 1;
    }

    /**
     * Solution recommended by Codesays
     */
    public int solutionRecommendedByCodesays(int[] A) {
        int[] presentValues = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) {
                return 0;
            } else if (presentValues[A[i] - 1] == 1) {
                return 0;
            } else {
                presentValues[A[i] - 1] = 1;
            }
        }
        return 1;
    }
}
