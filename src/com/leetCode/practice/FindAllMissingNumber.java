package com.leetCode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
