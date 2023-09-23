package com.leetcode.practice;

public class AnagramValidator {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] charCount = new int[26];
        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ++charCount[c[i] - 'a'];
            --charCount[c1[i] - 'a'];
        }
        for (int count : charCount)
            if (count != 0)
                return false;
        return true;
    }
}