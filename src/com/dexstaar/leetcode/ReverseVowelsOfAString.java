package com.dexstaar.leetcode;

import java.util.ArrayList;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        char[] returnChars = new char[chars.length];

        ArrayList<Character> vowels = new ArrayList<Character>();

        for(int i=0; i<chars.length; i++) {
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'
                    || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                vowels.add(chars[i]);
            }
        }

        int vowelsSize = vowels.size();

        for(int i=0; i<chars.length; i++) {
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'
                    || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                returnChars[i] = vowels.get(vowelsSize-1);
                vowelsSize--;
            } else {
                returnChars[i] = chars[i];
            }
        }

        return new String(returnChars);
    }
}
