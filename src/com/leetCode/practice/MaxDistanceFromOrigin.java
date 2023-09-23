package com.leetcode.practice;

//  https://leetcode.com/problems/furthest-point-from-origin/
public class MaxDistanceFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int countLR = 0, countU = 0;

        for(int a = 0; a < moves.length(); a++){
            if (moves.charAt(a) == 'L') countLR++;
            else if(moves.charAt(a) == 'R') countLR--;
            else if(moves.charAt(a) == '_') countU++;
        }
        return Math.abs(countLR) + countU;
    }
}
