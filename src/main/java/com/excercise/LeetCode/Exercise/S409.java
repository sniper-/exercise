package com.excercise.LeetCode.Exercise;

public class S409 {
    public int longestPalindrome(String s) {



        int[] p = new int[52];
        int count=0;
        char[] cs = s.toCharArray();

        for(char tmp : cs){
            int i = (tmp -65)>31 ? tmp-71 : tmp-65;
            p[i]++;
        }

        for(int t : p){
            //偶数全纪录，大于1的奇数，除了记录偶数部分，剩下的"1"只记一次
            count += t%2==0?t:(count%2==0?t:t-1);
        }
        return count;
    }

    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount];
        int min=2<<31-1;
        int t;
        for(int i=0; i<coins.length; i++){
            dp[coins[i]] = 1;
        }
        for(int i=0; i<coins.length; i++){
            t = amount-coins[i];
            while(t>0){
                min = Math.min(dp[t], min);
            }
        }
        return min<0?-1:min;
    }
}
