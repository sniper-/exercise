package com.excercise.LeetCode;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.sort;

/**
 * ClassName: S268
 * Version:
 * Description:
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/09/30 13:52
 */
public class S268 {
    public S268() { }

    /**
     * Description: 排序后数组下标应该等于对应值
     * 时间和空间复杂度取决于排序算法
     * @Param: [nums]
     * @return: int
     * @Author: sniper
     * @Date: 2019/9/30 13:53
     */
    public int missingNumberSort(int[] nums) {

        sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i] != i) return i;
        }
        return nums.length;
    }

    /**
     * Description: 排序后数组下标应该等于对应值
     * 时间复杂度取决于contains方法
     * @Param: [nums]
     * @return: int
     * @Author: sniper
     * @Date: 2019/9/30 13:53
     */
    public int missingNumberHash(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for(int i = 0; i < nums.length; i++) set.add(nums[i]);
         for(int i = 0; i <= nums.length; i++)
             if(!set.contains(i)) return i;
         return -1;
    }

    /**
     * Description: 添加一组正确序列进行异或，最后剩下的数字为缺失值
     * 时间复杂度O(n)，空间复杂度O(1)
     * @Param: [nums]
     * @return: int
     * @Author: sniper
     * @Date: 2019/9/30 13:53
     */
    public int missingNumberBit(int[] nums) {
         int res = nums.length;
         for(int i = 0; i < nums.length; i++){
             res ^= nums[i] ^ i;
         }
         return res;
    }

    /**
     * Description: 正常数列的和与输入数列的和做差，差值即为缺失值
     * 时间复杂度O(n²)，空间复杂度O(1)
     * @Param: [nums]
     * @return: int
     * @Author: sniper
     * @Date: 2019/9/30 13:53
     */
    public int missingNumberSummary(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
