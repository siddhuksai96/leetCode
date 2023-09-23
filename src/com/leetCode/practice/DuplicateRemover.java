package com.leetCode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DuplicateRemover {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
            System.out.println(Arrays.toString(nums));
        }
        return j;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        DuplicateRemover instance = new DuplicateRemover();
        instance.removeDuplicates(nums);
        System.out.println();
    }
}
