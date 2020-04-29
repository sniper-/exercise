package com.excercise.LeetCode.Exercise.Others;

/**
 * ClassName: S121
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/18 10:30
 */
public class S121 {
    public S121() {
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                tmp = prices[j] - prices[i];
                if (tmp > 0 && tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    public int maxProfitDP(int[] prices) {
        /**
         * Description: DP解法
         *  重叠子问题：TODO
         *  最优子结构：TODO
         * @Param: [prices]
         * @return: int
         * @Author: sniper
         * @Date: 2019/10/18 14:38
         */
        if (prices.length < 2) {
            return 0;
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < prices.length; i++) {
            //标记最小的值，每次优化并记录最大差值
            max = (prices[i] - min) > max ? (prices[i] - min) : max;
            min = prices[i] < min ? prices[i] : min;
        }
        return max;
    }
}
