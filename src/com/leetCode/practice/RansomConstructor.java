package com.leetcode.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RansomConstructor {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (char c : magazine.toCharArray())
            ++hash[c-'a'];
        for (char c : ransomNote.toCharArray())
            if (--hash[c-'a'] < 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        RansomConstructor instance = new RansomConstructor();
        System.out.println(instance.canConstruct("aa", "ab"));
    }
}
