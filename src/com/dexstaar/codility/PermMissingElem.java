package com.dexstaar.codility;

import java.util.Arrays;

/**
 * Answer of Codility Lesson 3: PermMissingElem
 * Scored:
 */
public class PermMissingElem {
    public int solution(int[] A) {
        long n = A.length + 1;
        long sum = n * (1+n) / 2;

        for(int elem : A) sum = sum - elem;

        return (int) sum;
    }
}
