package com.dexstaar.codility;

import java.util.HashMap;

/**
 * This is a Answer for Codility Lesson 8 : Dominator
 * Scored: 100
 */
public class Dominator {

    public int solution(int[] A) {
        int total = A.length;
        if(total == 1) return 0;

        int half = total/2;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                int count = map.get(A[i]);
                count++;

                if(count > half){
                    return i;
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
