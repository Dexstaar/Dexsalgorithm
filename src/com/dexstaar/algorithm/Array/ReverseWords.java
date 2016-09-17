package com.dexstaar.algorithm.Array;

import java.util.Arrays;

/**
 * Reverse workds
 * e.g) "Do or do not. there is no try." -> "try. no is there not, do or Do"
 */
public class ReverseWords {
    public String getReversedWords(String input){

        String[] words = input.split(" ");
        String rtn = "";

        for(int i=words.length-1; i>=0; i--){
            if(i != 0){
                rtn += words[i] + " ";
            }else{
                rtn += words[i];
            }
        }

        return rtn;
    }
}
