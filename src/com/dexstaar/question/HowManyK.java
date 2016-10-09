package com.dexstaar.question;

public class HowManyK {
    public int getCount(int start, int end, int k){
        StringBuilder nums = new StringBuilder();

        for(int i=start; i<=end; i++){
            nums.append(i);

        }

        char[] chars = nums.toString().toCharArray();
        char find = Character.forDigit(k, 10);

        int count = 0;

        for(char elem : chars){
            if(elem == find){
                count++;
            }
        }

        return count;
    }
}
