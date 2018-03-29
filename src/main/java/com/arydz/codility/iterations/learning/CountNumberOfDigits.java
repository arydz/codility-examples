package com.arydz.codility.iterations.learning;

public class CountNumberOfDigits {

    public int count(int number) {
        int result = 0;
        while (number > 0) {
            number /= 10;
            result++;
        }
        return result;
    }
}
