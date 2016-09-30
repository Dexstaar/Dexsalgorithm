package com.dexstaar.codility;

import java.util.Stack;

/**
 * Answer for Codility Lesson 7: Stonewall
 * Scored: 100
 */
public class StoneWall {
    public int solution(int[] H) {
        int count = H.length;

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=1; i<H.length; i++){
            if(H[i] == H[i-1]){
                count--;
            }else if(H[i] > H[i-1]){
                stack.push(H[i-1]);
            }else{
                while(!stack.empty() && stack.peek()>H[i]){
                    stack.pop();
                }
                if(!stack.empty() && stack.peek()==H[i]){
                    stack.pop();
                    count--;
                }
            }
        }

        return count;
    }
}
