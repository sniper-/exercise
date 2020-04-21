package com.excercise.LeetCode;

import java.util.Arrays;

/**
 * ClassName: S322
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/21 15:51
 */
public class S322 {
    public S322() {
    }

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;

        int[] dp = new int[amount+1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for(int coin : coins){
                if(i>=coin) {
                    dp[i] = Math.min(dp[i-coin]+1, dp[i]);
                }
            }
        }
        return dp[amount]<=amount? dp[amount] : -1;
    }
    /**
     * Description: 暴力递归
     * @Param: [coins, amount, count]
     * @return: void
     * @Author: sniper
     * @Date: 2020/4/21 17:34

    int min = Integer.MAX_VALUE;

    public void findMinCnt(int[] coins, int amount, int count) {

        if (amount < 0) {
            return;
        }
        if (amount == 0) {
            min = Math.min(min, count);
        }

        for (int i = 0;i < coins.length;i++) {
            findMinCnt(coins, amount - coins[i], count+1);
        }
    }

    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }

        findMinCnt(coins, amount, 0);

        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
     */
}
