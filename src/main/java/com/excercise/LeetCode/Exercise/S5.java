package com.excercise.LeetCode.Exercise;

import java.util.Arrays;

/**
 * ClassName: S5
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/20 10:22
 */
public class S5 {
    public S5() {
    }

//    public boolean isPalindromic(String s) {
//        int len = s.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (s.charAt(i) != s.charAt(len - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // 暴力解法
//    public String longestPalindrome(String s) {
//        String ans = "";
//        int max = 0;
//        int len = s.length();
//        for (int i = 0; i < len; i++) {
//            for (int j = i + 1; j <= len; j++) {
//                String test = s.substring(i, j);
//                if (isPalindromic(test) && test.length() > max) {
//                    ans = s.substring(i, j);
//                    max = Math.max(max, ans.length());
//                }
//            }
//        }
//        return ans;
//    }
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] P = new boolean[length][length];
        int maxLen = 0;
        String maxPal = "";
        for (int len = 1; len <= length; len++) {
            //遍历所有的长度
            for (int start = 0; start < length; start++) {
                int end = start + len - 1;
                if (end >= length){
                    //下标已经越界，结束本次循环
                    break;
                }
                P[start][end] = (len == 1 || len == 2 || P[start + 1][end - 1]) && s.charAt(start) == s.charAt(end); //长度为 1 和 2 的单独判断下
                if (P[start][end] && len > maxLen) {
                    maxPal = s.substring(start, end + 1);
                }
            }
        }

        return maxPal;
    }
}
