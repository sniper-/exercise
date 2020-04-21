package com.excercise.LeetCode;

import java.util.Arrays;

/**
 * ClassName: S673
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/15 09:33
 */
public class S673 {
    public S673() {
    }
    public int findNumberOfLIS(int[] nums) {
        //dp数组存放nums数组对应下标位置的最大子序列
        int[] dp = new int[nums.length];
        int[] snums = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(snums, 0);

        int cnt = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    if(dp[i] == dp[j]+1){
                        snums[i]++;
                    }
                }
            }
        }

        for(int k=0;k<dp.length;k++){
            max = Math.max(max, dp[k]);
        }

        for(int l=0;l<dp.length;l++){
            if(max == dp[l]){
                return snums[l];
            }
        }

        return 0;
    }
}
