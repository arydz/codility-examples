package com.arydz.codility.timecomplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) Math.abs(X - Y) / (double) D);
    }
}
