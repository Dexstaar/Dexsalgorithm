package com.dexstaar.codility;

/**
 * This is a Answer for Codility lesson 1 Iterations - BinaryGap
 * Scored: 80
 */
public class BinaryGap {

    public int getBinaryGap(int N) {

        // Converting to binarycode, then to char
        String binaryStr = Integer.toBinaryString(N);
        char[] binaryChars = binaryStr.toCharArray();

        int cnt = 0;
        int maxCnt = 0;

        // Iterate the chars
        for( int i=0; i<binaryChars.length; i++ ){

            if(binaryChars[i] == '1'){
                if(cnt > maxCnt){
                    // Replace max if cnt is bigger than max
                    maxCnt = cnt;
                    cnt = 0;
                }
            }else{
                cnt++;
            }
        }

        return maxCnt;
    }
}
