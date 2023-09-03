package com.leetCode.practice;

import static org.junit.Assert.assertTrue;
//  https://leetcode.com/problems/repeated-substring-pattern/
public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1)
            return false;
        for (int i = 1; i <= (s.length() / 2); i++) {
            if (s.equalsIgnoreCase(s.substring(0, i).repeat(s.length() / i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstring instance = new RepeatedSubstring();
        assertTrue(instance.repeatedSubstringPattern("aaa"));
    }
}
