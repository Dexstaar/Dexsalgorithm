package com.dexstaar.codility;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This is a Answer for Codility Lesson 6: MaxProductOfThree
 * Scored: 66
 * Note: Time complexity is O(N^2). In order to make it O(N), need to adapt Kadane's algorithm. Let's study.
 */
public class MaxProfit {
    public int solution(int[] A) {
        int maxProfit = 0;
        int gap = 0;
        int temp = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<A.length; i++){
            gap = A[i] - A[i-1];

            int queueSize = queue.size();

            while(queueSize > 0){
                temp = queue.poll() + gap;
                if(temp > maxProfit) maxProfit = temp;
                queue.add(temp);
                queueSize--;
            }

            queue.add(gap);
            if(gap > maxProfit) maxProfit = gap;
        }

        return maxProfit;
    }
}
