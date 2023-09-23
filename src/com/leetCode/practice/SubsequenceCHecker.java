package com.leetcode.practice;

public class SubsequenceChecker {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        for (int i = 0; i < tt.length && j < ss.length; i++) {
            if (tt[i] == ss[j])
                j++;
        }
        return j == ss.length ? true : false;
    }

    public static void main(String[] args) {
        SubsequenceChecker instance = new SubsequenceChecker();
        System.out.println(instance.isSubsequence("", "ahbgdc"));
    }
}
