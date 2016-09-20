package com.dexstaar.codility;

import java.util.Arrays;

/**
 * This is a Answer for Codility Lesson 6: MaxProductOfThree
 * Scored: 100
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        int aLength = A.length;

        return Math.max(A[0]*A[1]*A[aLength-1], A[aLength-3]*A[aLength-2]*A[aLength-1]);
    }
}
