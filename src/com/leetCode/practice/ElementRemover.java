package com.leetCode.practice;

//  https://leetcode.com/problems/remove-element/
public class ElementRemover {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[result++] = nums[i];
        }
        return result;
    }
}
