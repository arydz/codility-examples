package com.arydz.codility.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demo from Codility
 */
public class MissingInteger {

    public int solution(int[] A) {
        Arrays.sort(A);
        int result = 1;
        int expectedValue = 1;
        List<Integer> positiveOnly = new ArrayList<>();
        boolean expectedValuesInArray = true;
        for (int i = 0 ; i < A.length; i++) {
            if (A[i] > 0) {
                positiveOnly.add(A[i]);
            }
        }

        if (!positiveOnly.isEmpty()) {
            for (int i = 0; i < positiveOnly.size(); i++) {
                if (positiveOnly.get(i) == expectedValue) {
                    expectedValue++;
                }

                if (positiveOnly.get(i) > expectedValue) {
                    result = expectedValue;
                    expectedValuesInArray = false;
                }
            }

            if (expectedValuesInArray) {
                result = expectedValue;
            }
        }
        return result;
    }

}
