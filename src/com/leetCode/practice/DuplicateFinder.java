package com.leetCode.practice;

import java.util.HashSet;

public class DuplicateFinder {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) {
                return num;
            }
        }
        return -1;

//        return (nums.length*(nums.length-1))/2;
    }
}
