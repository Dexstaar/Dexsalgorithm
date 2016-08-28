package com.dexstaar.codility;

/**
 * This is a Answer for Codility lesson 1 Iterations - BinaryGap
 * Scored: 100
 */
public class BinaryGap {

    public int solution(int N) {

        // Converting to binarycode
        String binaryStr = Integer.toBinaryString(N);

        int cnt = 0;
        int gap = 0;

        // Iterate the chars
        for( int i=0; i<binaryStr.length(); i++ ){
            if(binaryStr.charAt(i) == '1'){
                // Put max number into gap
                gap = Math.max(gap,cnt);
                cnt = 0;

            }else{
                cnt++;
            }
        }

        return gap;
    }
}
