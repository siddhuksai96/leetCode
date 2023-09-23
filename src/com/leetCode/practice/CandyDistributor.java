package com.leetCode.practice;

import java.util.PriorityQueue;
import java.util.function.Supplier;

public class CandyDistributor {
    public int candy(int[] ratings) {

        int result = ratings.length;
        for (int i = 0; i < ratings.length; i++) {
            if (i > 0 && (ratings[i - 1] < ratings[i])) {
                System.out.println(i + "==" + ratings[i]);
                result++;
            }
            if (i < ratings.length - 2 && ratings[i + 1] < ratings[i]) {
                System.out.println(i + "**" + ratings[i]);
                result++;
            }
            if (i == 0 && ratings[i] > ratings[i + 1]) {
                System.out.println(i + "--" + ratings[i]);
                result++;
            }
        }
        return result;
    }
}
