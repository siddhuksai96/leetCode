package com.leetcode.practice;

import java.util.*;

public class WeakestRowsFinder {
    public int[] kWeakestRows(int[][] matrix, int k) {
        int[][] rowStrengths = new int[matrix.length][2];

        for (int i = 0; i < matrix.length; i++) {
            rowStrengths[i][0] = findSoldierCount(matrix[i]);
            rowStrengths[i][1] = i;
        }

        Arrays.parallelSort(rowStrengths, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = rowStrengths[i][1];
        }

        return result;
    }

    private int findSoldierCount(int[] row) {
        int left = 0, right = row.length - 1;

        // Perform binary search to find the count of soldiers
        while (left <= right) {
            int mid = (left + right) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
