package com.leetCode.practice;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
//  https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            if (!numCount.containsKey(num)) {
                numCount.put(num, 1);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate instance = new ContainsDuplicate();
        int[] nums = {1};
        assertTrue(instance.containsDuplicate(nums));
    }
}
