package com.dexstaar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            int gap = target - nums[i];

            if(numsMap.containsKey(gap)  && numsMap.get(gap) != i) {
                return new int[] {i, numsMap.get(gap)};
            }
        }

        return null;
    }
}
