package com.dexstaar.codility;

/**
 * This is a Answer for Codility Lesson 2: CyclicRotation
 * Scored: 100
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        int N = A.length;

        if(N == 0) return A;
        if(K == 0) return A;
        if(K >= N) K %= N;

        int[] newArr = new int[N];

        for(int i=0; i<N; i++){

            newArr[i] = (i < K) ? A[N-K+i] : A[i-K];
        }

        return newArr;
    }
}
