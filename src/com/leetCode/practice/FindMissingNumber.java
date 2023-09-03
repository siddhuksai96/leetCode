package com.leetCode.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
//  https://leetcode.com/problems/missing-number/
public class FindMissingNumber {
    public int missingNumber(int[] nums) {
        List<Integer> range = IntStream.rangeClosed(0, nums.length).boxed().collect(Collectors.toList());
        for (int num : nums) {
            range.remove((Integer) num);
        }
        return range.get(0);
    }

    public static void main(String[] args) {
        FindMissingNumber missingNumber = new FindMissingNumber();
        int[] nums = {1,2,2};
        assertEquals(0, missingNumber.missingNumber(nums));
    }
}
