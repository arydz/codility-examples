package com.arydz.codility.arrays.learning;

public class ReversedArray {

    public int[] solution(int[] array) {

        int n = array.length;

        for (int i = 0; i < Math.ceil(n / 2.f); i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        return array;
    }
}
