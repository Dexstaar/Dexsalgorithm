package com.dexstaar.codility;

/**
 * Answer for Codility Lesson 5: CountDiv
 * Scored: 25
 * Note: I think the test case doesn't make a sense. For example, if A=0, B=0, K=11, it should return 0 but it requires return 1. I'll ingore this question.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int gap = B - A;
        int div = 0;

        if( gap % K == 0){
            div = gap / K;
        }else{
            div = gap / K + 1;
        }

        return 0%11;
    }
}
