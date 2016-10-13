package com.dexstaar.leetcode;

public class ReverseInteger {
    public int reverse(int x) {

        try {

            char[] chars = Integer.toString(x).toCharArray();
            char[] reversed = new char[chars.length];

            if (chars[0] == '-') {
                reversed[0] = chars[0];

                for (int i = 1; i < chars.length; i++) {
                    reversed[chars.length - i] = chars[i];
                }
            } else {
                for (int i = 0; i < chars.length; i++) {
                    reversed[chars.length - 1 - i] = chars[i];
                }
            }

            return Integer.parseInt(new String(reversed));
        }catch (Exception e){
            return 0;
        }
    }
}
