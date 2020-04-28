package com.excercise.LeetCode.Exercise;

import java.util.Arrays;

/**
 * ClassName: S674
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/15 10:19
 */
public class S674 {
    public S674() {
    }

    public int findLengthOfLCIS(int[] nums) {
        if(0 == nums.length) return 0;
        //dp数组存放nums数组对应下标位置的最大子序列
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                dp[i] = dp[i-1] + 1;
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
