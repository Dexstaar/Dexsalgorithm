package com.dexstaar.codility;

import java.util.Arrays;

/**
 * This is a Answer for Codility Lesson 2: CyclicRotation
 * Scored: 100
 */
public class Triangle {
    public int solution(int[] A) {

        if(A.length<3) return 0;

        Arrays.sort(A);

        for(int i=1; i<A.length-1; i++){
            //To void overflows when max integers are given
            if(A[i-1] > A[i+1]-A[i] && A[i] > A[i-1]-A[i+1] && A[i-1]>A[i]-A[i+1]) return 1;
        }

        return 0;
    }
}
