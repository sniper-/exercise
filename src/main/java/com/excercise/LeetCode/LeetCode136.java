package com.excercise.LeetCode;

import static java.util.Arrays.sort;

/**
 * ClassName: LeetCode136
 * Version:
 * Description:
 *
 * 136.Single Number
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/09/30 11:23
 */
public class LeetCode136 {

    public int singleNumber(int[] nums) {
        /**
         * Description: N^N=0,时间复杂度O(n)，空间复杂度O(1)
         * @Param: [nums]
         * @return: int
         * @Author: sniper
         * @Date: 2019/9/30 14:14
         */
        int single = 0;
        for (int i : nums) {
            single = single ^ i;
        }
        return single;
    }

}
