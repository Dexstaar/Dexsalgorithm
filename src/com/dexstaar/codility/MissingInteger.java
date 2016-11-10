package com.dexstaar.codility;

import java.util.HashMap;

/**
 * Answer for Codility Lesson 4: MissingInteger
 * Scored: 100
 */
public class MissingInteger {
    public int solution(int[] A) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(int elem : A){
            map.put(elem, true);
        }

        int count = 1;

        for(int i=1; i<=A.length; i++){
            if( map.get(i) == null ) return i;
            count++;
        }

        return count;
    }
}
