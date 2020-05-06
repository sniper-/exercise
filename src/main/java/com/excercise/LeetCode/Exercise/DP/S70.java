package com.excercise.LeetCode.Exercise.DP;

/**
 * ClassName: S70
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/05/06 14:08
 */
public class S70 {
    public S70() {
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];

        if(n<2){return 1;}
        if(n==2){return 2;}
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<n+1; i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}
