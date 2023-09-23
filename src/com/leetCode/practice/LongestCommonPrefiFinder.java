package com.leetcode.practice;

import java.util.Arrays;

public class LongestCommonPrefiFinder {
    public String longestCommonPrefix(String[] strs) {
        String resultStr = strs[0];
        for (String str : strs) {
            if (str.length() < resultStr.length())
                resultStr = str;
        }
        StringBuilder result = new StringBuilder(resultStr);

        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].substring(0, result.length()).equalsIgnoreCase(result.toString())) {
                result = result.deleteCharAt(result.length() - 1);
                if (result.length() == 0)
                    return "";
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] nums = {"reflower", "flow", "flight"};
        LongestCommonPrefiFinder instance = new LongestCommonPrefiFinder();
        System.out.println(instance.longestCommonPrefix(nums));
    }
}
