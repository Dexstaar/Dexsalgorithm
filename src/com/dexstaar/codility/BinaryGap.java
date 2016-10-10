package com.dexstaar.codility;

/**
 * This is a Answer for Codility lesson 1 Iterations - BinaryGap
 * Scored: 100
 */
public class BinaryGap {

    public int solution(int N) {
        String binaryCode = Integer.toBinaryString(N);

        int gap = 0;
        int max = 0;
        int lastPos = 0;

        for(int i=0; i<binaryCode.length(); i++){
            if(binaryCode.charAt(i) == '1'){
                gap = i - lastPos - 1;
                lastPos = i;
            }

            if(gap > max) max = gap;
        }

        return max;
    }
}
