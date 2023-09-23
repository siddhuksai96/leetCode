package com.leetCode.practice;

public class DuplicateRemover2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int i = 0, j = 0;
        while (i < nums.length) {
            nums[j++] = nums[i++];
            if (i < nums.length && nums[i] == nums[j - 1])
                nums[j++] = nums[i++];
            while (i < nums.length && nums[i] == nums[j - 1])
                i++;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        DuplicateRemover2 instance = new DuplicateRemover2();
        int i = instance.removeDuplicates(nums);
        System.out.println(i);
    }
}
