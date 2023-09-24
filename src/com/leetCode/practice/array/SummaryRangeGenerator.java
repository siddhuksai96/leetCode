package com.leetcode.practice.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangeGenerator {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> al=new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String arrow ="->";
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;

            if(start!=nums[i]){
                al.add(sb.append(start).append(arrow).append(nums[i]).toString());
            }
            else{
                al.add(sb.append(start).toString());
            }
            sb.setLength(0);
        }
        return al;
    }
}