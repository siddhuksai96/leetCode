package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

//  https://leetcode.com/problems/two-sum/
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[j] + nums[j - i]) == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return null;
    }
//    Map is easier to track pairs so load array to map while comparing with target
//    Map.containsKey complexity is O(1) and List contains complexity is O(n) to O(log(n))
}