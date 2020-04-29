package com.excercise.LeetCode.Exercise.Others;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: S448
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/18 09:51
 */
public class S448 {
    public S448() {
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        /**
         * Description: O(n),O(n)
         * @Param: [nums]
         * @return: java.util.List<java.lang.Integer>
         * @Author: sniper
         * @Date: 2019/10/18 10:07
         */
        int tmp[] = new int[nums.length];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            tmp[nums[i] - 1]++;
        }
        for (int j = 0; j < tmp.length; j++) {
            if (tmp[j] == 0) {
                res.add(j + 1);
            }
        }
        return res;
    }

    /**
     * 找出 1 - n 中没有出现的数字。不能使用额外的空间，两次循环时间复杂度为 2O(n)，即为 O(n)。
     * <p>
     * 解题思路：使用数组的下标来标记数字的出现于否，通过一遍遍历即可标记出全部已经出现的数组
     * <p>
     * [4,3,2,7,8,2,3,1] 初始数据
     * <p>
     * [4,3,2,-7,8,2,3,1] 第一个数据 4 出现，将数组的第四个也就是下标 3 的数据修改为负数。-7 计算时，通过绝对值处理一下即可不影响数据的计算
     * [4,3,-2,-7,8,2,3,1]
     * [4,-3,-2,-7,8,2,3,1]
     * [4,-3,-2,-7,8,2,-3,1]
     * [4,-3,-2,-7,8,2,-3,-1]
     * [4,-3,-2,-7,8,2,-3,-1]
     * [4,-3,-2,-7,8,2,-3,-1]
     * [-4,-3,-2,-7,8,2,-3,-1]
     * <p>
     * 计算结束，数组的第五个，第六个依然为整数，证明 5,6 没有出现
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbersPass(int[] nums) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                results.add(i + 1);
            }
        }
        return results;
    }
}
