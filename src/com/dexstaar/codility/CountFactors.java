package com.dexstaar.codility;

/**
 * Answer for Codility Lesson 10: CountFactors
 * Scored: 100
 */


public class CountFactors {
    public int solution(int N) {
        int cnt = 0;

        double d = Math.sqrt(N);

        for(int i=1; i<=d; i++) {
            if(N % i == 0) {
                cnt++;

                if(N/i != i) cnt++;
            }

        }

        return cnt;
    }
}
