package com.dexstaar.codility;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Answer for Codility Lesson 7: Fish
 * Scored: 100
 * Note: I don't understand why time complexity indicates O(N) on Codility even though there is while in for.
 */
public class Fish {
    public int solution(int[] A, int[] B) {
        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<A.length; i++){
            //push fish size to the stack if the fish is down toward
            if(B[i] == 1){
                stack.push(A[i]);
            }else{
                if(stack.empty()){
                    count++;
                }else{
                    try{
                        //if fishes in the stack are smaller than the fish [i]
                        while(stack.peek()<A[i]){
                            stack.pop();
                        }
                    }catch(EmptyStackException e){
                        //no fish in the stack remains, which means fish[i] is survived
                        count++;
                    }
                }
            }
        }

        //count means alive fish to uptoward and stack.size means alive to downtoward
        return count + stack.size();
    }
}
