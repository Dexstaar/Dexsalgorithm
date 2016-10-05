package com.dexstaar.codility;

import java.util.Arrays;

/**
 * This is a Answer for Codility Lesson 6: Distinct
 * Scored: 100
 */
public class Distinct {
    public int solution(int[] A) {

        if(A.length == 0) return 0;

        Arrays.sort(A);

        int previous = A[0];
        int count = 1;

        for(int i=0; i<A.length; i++){

            if(A[i] != previous){
                count++;
                previous = A[i];
            }
        }

        return count;
    }
}
