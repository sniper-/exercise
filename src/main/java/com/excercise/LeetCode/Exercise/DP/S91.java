package com.excercise.LeetCode.Exercise.DP;

/**
 * ClassName: S91
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/05/06 15:07
 */
public class S91 {
    public S91() {
    }

    //状态转移方程不对
//    public int numDecodings(String s) {
//        if(0 == s.length() || 1 == s.length()){
//            return 0;
//        }
//        int[] dp = new int[s.length()+1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for(int i=2; i<s.length(); i++){
//            if((int)s.charAt(i-1)-48 < 3){
//                dp[i+1] = 2*dp[i]-1;
//            }else{
//                dp[i+1] = dp[i];
//            }
//        }
//        return dp[s.length()];
//    }
}
