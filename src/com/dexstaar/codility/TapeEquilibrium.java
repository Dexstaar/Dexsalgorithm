package com.dexstaar.codility;

import java.util.stream.IntStream;

/**
 * An answer for Codility Lesson 3: TapeEquilibrium
 * Scored: 100
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        int sum = IntStream.of(A).sum();

        int left = 0;
        int right;
        int gap;
        int min = 0;

        for(int i=1; i<A.length; i++){
            left += A[i-1];
            right = sum - left;
            gap = Math.abs(left-right);

            if(i == 1 || gap < min) min = gap;
        }

        return min;
    }
}
