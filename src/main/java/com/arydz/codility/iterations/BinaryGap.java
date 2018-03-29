package com.arydz.codility.iterations;

public class BinaryGap {

    public int solution(int N) {
        char[] binary = Integer.toBinaryString(N).toCharArray();
        int length = 0;
        int resultLength = 0;
        for (int i = 0 ; i <binary.length; i++) {
            if (binary[i] == '0') {
                length++;
            }
            if (binary[i] == '1') {
                if (resultLength < length) {
                    resultLength = length;
                }
                length = 0;
            }
        }
        return resultLength;
    }
}
