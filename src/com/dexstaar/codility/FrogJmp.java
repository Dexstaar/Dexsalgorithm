package com.dexstaar.codility;

/**
 * Answer of Codility Lesson 3: FrogJmp
 * Scored: 100
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int dis = Y-X;
        int cnt = (dis % D != 0) ? dis/D+1 : dis/D;

        return cnt;
    }
}
