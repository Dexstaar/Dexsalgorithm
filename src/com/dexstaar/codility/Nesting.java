package com.dexstaar.codility;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Answer for Codility Lesson 7: Nesting
 * Scored: 100
 */
public class Nesting {
    public int solution(String S) {

        Stack stack = new Stack();

        char[] arr = S.toCharArray();

        try{
            for(char elem : arr){


                if(elem == '('){
                    stack.push(elem);
                }else{
                    stack.pop();
                }
            }
        }catch(EmptyStackException ese){
            return 0;
        }

        if(stack.size() == 0) return 1;

        return 0;
    }
}
