package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangleGenerator {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows > 0)
            result.add(Collections.singletonList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < result.get(i - 1).size(); j++)
                temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            temp.add(1);
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangleGenerator instance = new PascalTriangleGenerator();
        System.out.println(instance.generate(2));
    }
}
