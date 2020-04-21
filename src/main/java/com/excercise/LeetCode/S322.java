package com.excercise.LeetCode;

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

    public int coinChange(int[] coins, int amount){
//        int[] dp = new int[amount];
//        dp[0] = 2<<31-1;
        if(coins.length == 0){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
           if(coin == amount){
               return 1;
           }if(coin > amount){
               return Integer.MAX_VALUE;
           }
        }
        for(int coin : coins){
            min = Math.min(min, 1+coinChange(coins, amount-coin));
        }
        return min>Integer.MAX_VALUE?-1:min;
    }
}
