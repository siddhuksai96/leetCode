package com.leetcode.practice.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Base case...
        if (nums.length == 1 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse for all elements of the given array in a for loop...
        for (int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true...
            if (!hset.add(nums[j])) {
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if (hset.size() >= k + 1) {
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 instance = new ContainsDuplicate2();
        int[] nums = {4, 1, 2, 3, 1, 5};
        List<Integer> a = new ArrayList<>();
        System.out.println(a.add(1));
//        System.out.println(instance.containsNearbyDuplicate(nums,3));
    }
}
