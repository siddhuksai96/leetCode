package com.leetcode.practice;

//  https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/
public class PickupDeliveryCounter {

    public int countOrders(int numPairs) {
        // Memoization array to store computed values
        long[] dp = new long[numPairs + 1];

        // Base case: there is one way to arrange 0 pairs
        dp[0] = 1;
        int MOD = (int) 1e9 + 7;  // Modulus for calculations
        // Iterate over all values of pairs from 1 to n
        for (int currentPairs = 1; currentPairs <= numPairs; currentPairs++) {
            // Calculate the number of valid orders for the current number of pairs
            dp[currentPairs] = dp[currentPairs - 1] * (2 * currentPairs - 1) * currentPairs % MOD;
        }

        return (int) dp[numPairs]; // Return the result for n pairs
    }
}
