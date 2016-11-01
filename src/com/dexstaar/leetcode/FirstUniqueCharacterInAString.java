package com.dexstaar.leetcode;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<chars.length; i++) {
            if(map.get(chars[i]) == null) {
                map.put(chars[i], 1);
            } else {
                int cnt = map.get(chars[i]);
                cnt++;
                map.put(chars[i], cnt);
            }
        }

        for(int i=0; i<chars.length; i++) {
            if(map.get(chars[i]) == 1) return i;
        }

        return -1;

    }
}
