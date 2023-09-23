package com.leetCode.practice.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetTotalEfficiency {
    public static int getTotalEfficiency(List<Integer> skills) {
        List<Integer> efficiences = new ArrayList<>();
        int numberOfTeams=skills.size()/2;
        int sumOfSkills = getSumOfList(skills) / numberOfTeams;
        for (int i = 0; i <= (skills.size() / 2) - 1; i++) {
            for (int j = i + 1; j <= skills.size() - 1; j++) {
                if (skills.get(j) == sumOfSkills - skills.get(i)) {
                    efficiences.add(skills.get(i) * skills.get(j));
                    skills.remove(i);
                    skills.remove(j-1);
                    i--;
                    j-=2;
                }
            }
            if (efficiences.size() != i + 1)
                return -1;
        }
        return getSumOfList(efficiences);
    }

    private static int getSumOfList(List<Integer> integerList) {
        int sum = 0;
        for (Integer i : integerList)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
//        assertEquals(13, getTotalEfficiency(Arrays.asList(5, 4, 2, 1)));
//        assertEquals(7, getTotalEfficiency(Arrays.asList(1, 2, 3, 2)));
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 1, 1, 2, 3, 4);
        assertEquals(14, getTotalEfficiency(list));
    }
}
