package com.dexstaar.codility;

public class BinaryGap1 {
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        char[] arr = binary.toCharArray();

        int cnt = 0;
        int gap = 0;
        int max = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                if(cnt != 0) {
                    gap = cnt;
                    cnt = 0;

                    if(gap > max) max = gap;
                }
            } else {
                cnt++;
            }
        }

        return max;

    }
}
