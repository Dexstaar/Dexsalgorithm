package com.dexstaar.codility;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Answer for Codility Lesson 7: Brakets
 * Scored: 100
 */
public class Brakets {
    public int solution(String S) {
        Stack stack = new Stack();

        char[] arr = S.toCharArray();

        for(char elem: arr){
            if(elem == '{' || elem == '[' || elem == '('){
                stack.push(elem);
            }else{
                try{
                    char latest = (char) stack.pop();

                    switch(elem){
                        case ')':
                            if( latest != '(') return 0;
                            break;
                        case ']':
                            if( latest != '[') return 0;
                            break;
                        case '}':
                            if( latest != '{') return 0;
                            break;
                    }
                }catch(EmptyStackException e){
                    return 0;
                }
            }
        }

        if(stack.size() == 0){
            return 1;
        }else{
            return 0;
        }


    }
}
