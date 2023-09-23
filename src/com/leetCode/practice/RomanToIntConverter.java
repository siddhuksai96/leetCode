package com.leetcode.practice;

//  https://leetcode.com/problems/roman-to-integer
public class RomanToIntConverter {
    public int romanToInt(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();
        int prevValue = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            int romanIntValue = convertRomanToInt(charArray[i]);
            if (romanIntValue >= prevValue)
                result += romanIntValue;
            else
                result -= romanIntValue;
            prevValue = romanIntValue;
        }
        return result;
    }

    private int convertRomanToInt(int c) {
        int result = 0;
        switch (c) {
            case 73:
                result = 1;
                break;
            case 86:
                result = 5;
                break;
            case 88:
                result = 10;
                break;
            case 76:
                result = 50;
                break;
            case 67:
                result = 100;
                break;
            case 68:
                result = 500;
                break;
            case 77:
                result = 1000;
                break;
            default:
                break;
        }
        return result;
    }
}