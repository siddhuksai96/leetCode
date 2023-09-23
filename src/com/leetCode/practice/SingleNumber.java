package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
//  https://leetcode.com/problems/single-number/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> numsList = new ArrayList();
        for (int num : nums) {
            if (numsList.contains(num)) {
                numsList.remove((Integer) num);
            } else {
                numsList.add(num);
            }
        }
        return numsList.get(0);
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {-1, 2, 2};
        assertEquals(3, singleNumber.singleNumber(nums));
    }
}
