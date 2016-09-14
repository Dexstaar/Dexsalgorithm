package com.dexstaar.codility;

import java.util.HashMap;

/**
 * Answer for Codility Lesson 4: FrogRiverOne
 * Scored: 100
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {

        // Do the sum of the arithmetical progression
        int sum = X * (X+1) / 2;

        // HashMap
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        // loop
        for(int i=0; i<A.length; i++){
            // If HashMap doesn't contain the value, subtract the value from the sum
            if( map.get(A[i]) == null){
                map.put(A[i], true);
                sum -= A[i];
            }

            //Return i when sum is 0
            if(sum == 0) return i;
        }

        //if the sum doesn't meet 0, return -1
        return -1;
    }
}
