package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IsomorphValidator {
    public boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length())
//            return false;

        int map1[] = new int[200];
        int map2[] = new int[200];
        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (map1[c[i]] != map2[c1[i]])
                return false;
            map1[c[i]] = i + 1;
            map2[c1[i]] = i + 1;
        }
        return true;
    }
}
