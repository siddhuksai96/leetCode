package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

//  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllMissingNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            if (!numsList.contains(num)) {
                numsList.add(num);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num = 1; num <= nums.length; num++) {
            if (!numsList.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllMissingNumber findAllMissingNumber = new FindAllMissingNumber();
        int[] nums = {1, 3, 3, 3};
        findAllMissingNumber.findDisappearedNumbers(nums);
    }
}
