package com.excercise.LeetCode.Exercise;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * 示例 1:
 * Example 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 * Input: 120
 * Output: 21
 * Note:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 * [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/14 09:16
 */
public class S7 {
    public S7() {}

    public int reverse(int x){
        int a = 0;
        while(x !=0){
            a = a*10 + x%10;
            x = x / 10;
        }

        if(a >= -(1<<31) && a <= (1<<31)-1){
            return a;
        }
        return 0;
    }
}
