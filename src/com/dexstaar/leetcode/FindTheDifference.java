package com.dexstaar.leetcode;

import java.util.Arrays;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return tArr[tArr.length];
    }
}
