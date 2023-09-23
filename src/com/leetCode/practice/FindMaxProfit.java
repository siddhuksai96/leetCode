package com.leetcode.practice;
//  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class FindMaxProfit {

    public int maxProfit(int[] prices) {
        int minBuyPrice = prices[0];
        int result = 0;
        for (int price : prices) {
            minBuyPrice = Math.min(price, minBuyPrice);
            result = Math.max(result, price - minBuyPrice);
        }
        System.gc();
        return result;
    }


    public static void main(String[] args) {
        FindMaxProfit maxProfit = new FindMaxProfit();
        int[] nums = {7, 6, 4, 3, 1};
        System.out.println(maxProfit.maxProfit(nums));
    }
}
