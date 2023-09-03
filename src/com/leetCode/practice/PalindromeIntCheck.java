package com.leetCode.practice;

import static org.junit.Assert.assertTrue;
//  https://leetcode.com/problems/palindrome-number/
public class PalindromeIntCheck {
    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0)
            return true;
        if (x > 0) {
            String stringX = Integer.toString(x);
            for (int i = 0; i < stringX.length() / 2; i++) {
                if (stringX.charAt(i) != stringX.charAt(stringX.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeIntCheck palindrome = new PalindromeIntCheck();
        assertTrue(palindrome.isPalindrome(1101));
    }
}
