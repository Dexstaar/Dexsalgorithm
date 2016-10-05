package com.dexstaar.main;

import com.dexstaar.question.*;

/**
 * Created by dexstar on 9/20/16.
 */
public class Question {
    public static void main(String[] args) {




        // A,B,C 를 하나씩 담고있는 최단 거리를 구하라
        NextOne nextOne = new NextOne();

        int[] posA = {1, 18, 30, 44, 58};
        int[] posB = {2, 23, 50, 60};
        int[] posC = {3, 35, 42, 54, 63};

        nextOne.solution(posA, posB, posC);

    }
}
