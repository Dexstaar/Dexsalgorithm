package com.dexstaar.codility;
/**
 * Answer for Codility Lesson 15: AbsDistnct
 * Scored: 100
 */

import java.util.HashMap;

public class AbsDistinct {
    public int solution(int[] A) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(int elem : A) {
            int absElem = Math.abs(elem);
            if(!map.containsKey(absElem)) {
                map.put(absElem, true);
            }
        }

        return map.size();

    }

}
