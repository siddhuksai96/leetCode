package com.leetcode.practice;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch instance = new BinarySearch();
        int[] nums = {2, 5};
        System.out.println(instance.search(nums, 5));

    }
}
