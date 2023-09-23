package com.leetcode.practice;

import java.util.Arrays;

public class LastWordLengthFinder {
    public int lengthOfLastWord(String s) {
        String temp = s.trim();
        int j = temp.length();
        while (j > 1 && temp.charAt(j) != ' ') {
            j--;
        }
        return temp.length() - j;
    }
}
