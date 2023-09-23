package com.leetcode.practice;

import java.util.Arrays;

public class ArrayRotater {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] nums, int from, int to) {
        while (to > from) {
            int temp = nums[from];
            nums[from] = nums[to];
            nums[to] = temp;
            to--;
            from++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        ArrayRotater instance = new ArrayRotater();
        instance.rotate(nums, 3);


//        Output: [5,6,7,1,2,3,4]
    }
}
// i -> i+k ,,,,,,,,,, n-i -> if val>n then i+k