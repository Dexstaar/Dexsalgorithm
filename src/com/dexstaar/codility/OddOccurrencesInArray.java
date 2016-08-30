package com.dexstaar.codility;


import java.util.Stack;

/**
 * This is a Answer for Codility Lesson 2: CyclicRotation
 * Scored: 100
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int rtnNum = 0;

        for(int arrNum : A){
            rtnNum ^= arrNum;
        }

        return rtnNum;
    }
}
