package com.leetCode.practice;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
//  https://leetcode.com/problems/climbing-stairs/
public class CombinationsToClimbStairs {
    public static int climbStairs(int n) {
        List<Integer> combinations = new ArrayList<>();
        combinations.add(0, 0);
        combinations.add(1, 1);
        combinations.add(2, 2);

        for (int i = 3; i <= n; i++) {
            combinations.add(i, combinations.get(i - 1) + combinations.get(i - 2));
        }
        return combinations.get(n);
    }

    public static void main(String[] args) {
        CombinationsToClimbStairs climbStairs = new CombinationsToClimbStairs();
        assertEquals(5, climbStairs(4));
    }
}
