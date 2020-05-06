package com.excercise.LeetCode.Exercise.DP;

/**
 * ClassName: S53
 * Version:
 * Description:
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * @Program:
 * @Author: sniper
 * @Date: 2020/05/06 10:34
 */
public class S53 {
    public S53() {
    }

    //超出内存限制
//    public int maxSubArray(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        int len = nums.length;
//        int[][] dp = new int[len][len];
//        for(int i=len-1; i>=0; i--){
//            for(int j=i; j>=0; j--){
//                dp[j][i] = (j==len-1) ? (dp[j+1][i]+nums[j]) : nums[i];
//                max = Math.max(dp[j][i], max);
//            }
//        }
//
//        return max;
//    }

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            if(nums[i-1]+nums[i] > nums[i]){
                nums[i] = nums[i-1]+nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
