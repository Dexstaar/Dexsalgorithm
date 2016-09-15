package com.dexstaar.codility;

/**
 * Answer for Codility Lesson 5: PassingCars
 * Scored: 100
 */
public class PassingCars {
    public int solution(int[] A) {
        int multiflier = 0;
        long count = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                multiflier++;
            }else if(A[i] == 1){
                count += multiflier * 1;
            }
        }

        if(count > 1000000000) return -1;

        return (int)count;
    }
}
