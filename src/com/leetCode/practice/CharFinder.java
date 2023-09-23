package com.leetcode.practice;

public class CharFinder {
    public char nextGreatestLetter(char[] letters, char target) {
//           check letter > target if yes call it max
        char result = 500, smallestChar=letters[0];
        for (char ch : letters) {
            if (ch > target && ch < result)
                result = ch;

            if (ch < smallestChar)
                smallestChar = ch;
        }
        return result==500?smallestChar:result;
    }

    public static void main(String[] args) {
        CharFinder instance = new CharFinder();
        char[] letters = {'c', 'f', 'j'};
        System.out.println(instance.nextGreatestLetter(letters, 'c'));
    }
}
