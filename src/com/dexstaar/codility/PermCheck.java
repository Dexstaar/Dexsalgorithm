package com.dexstaar.codility;

/**
 * Answer for Codility Lesson 4: PermCheck
 * Scored: 70
 * Can not catch if total sum is correct, but not permutation
 * How can I improve?
 */
public class PermCheck {

    public int solution(int[] A) {

        // Get sum
        int n = A.length;
        int sum = (1 + n) * n / 2;

        // subtract each elem
        for(int elem : A) sum -= elem;

        // if sum is 0 return 1
        if(sum == 0) return 1;

        return 0;
    }
}
