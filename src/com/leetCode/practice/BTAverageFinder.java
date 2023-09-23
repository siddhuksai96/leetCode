package com.leetCode.practice;

import com.leetCode.practice.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BTAverageFinder {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> levelAverages = new ArrayList<>();
        levelAverages.add((double) root.val);
//        while (root.left!=null && root.right!=null)
//            levelAverages.add();

        return levelAverages;
    }
}
