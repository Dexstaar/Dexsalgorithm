package com.dexstaar.codility;

import java.util.Arrays;
import java.util.HashMap;

/**
 * This is a Answer for Codility Lesson 6: Distinct
 * Scored: 55
 * Note: Can not find the solution that the time complexity is lower than O(N^2)
 */
public class EquiLeader55 {

    public int solution(int[] A) {

        int ALength = A.length;
        int count = 0;

        for(int i=0; i<ALength-1; i++){

            int[] left = Arrays.copyOfRange(A, 0, i+1);
            int[] right = Arrays.copyOfRange(A, i+1, ALength);

            if( getLeader(left) == getLeader(right) && getLeader(right) != -1 ){
                count++;
            }
        }

        return count;


    }


    private int getLeader(int[] A) {
        int total = A.length;
        if(total == 1) return A[0];

        int half = total/2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                int count = map.get(A[i]);
                count++;

                if(count > half){
                    return A[i];
                }else{

                    map.put(A[i], count);
                }

            }else{
                map.put(A[i], 1);
            }
        }
        return -1;
    }

}
