package com.leetcode.practice.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParanthesesValidator {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        char openBraceF = '{';
        char openBrace = '[';
        char openParentheses = '(';
        for (char c : s.toCharArray()) {
            if (c == openBraceF || c == openBrace || c == openParentheses)
                stack.push(c);
            else if (stack.size() != 0 && ((c == '}' && stack.peek() == openBraceF) || (c == ')' && stack.peek() == openParentheses)
                    || (c == ']' && stack.peek() == openBrace)))
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}
