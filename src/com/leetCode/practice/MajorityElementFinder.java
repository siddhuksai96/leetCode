package com.leetcode.practice;

//  https://leetcode.com/problems/majority-element
public class MajorityElementFinder {
    public int majorityElement(int[] nums) {
//  Moore voting algorithm ----  if there is a majority element in an array, it will always remain in the lead,
//  even after encountering other elements.
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
            if (count > nums.length / 2)
                return candidate;
        }
        return candidate;
    }
}