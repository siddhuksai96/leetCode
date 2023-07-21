package com.leetCode.practice;

import java.util.HashMap;
import java.util.Map;

class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap();
        for(int i=0;i<=nums.length-1;i++){
            if(numsMap.containsKey(target-nums[i])) {
                int toReturn[] = {numsMap.get(target-nums[i]), i};
                return toReturn;
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }
//    Map is easier to track pairs so load array to map while comparing with target
}