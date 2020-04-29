package com.excercise.LeetCode.Exercise.Others;

/**
 * ClassName: S169
 * Version:
 * Description:
 * <p>
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/21 14:46
 */
public class S169 {
    public S169() {
    }

    //快排后取中间的数字
    public int majorityElementSort(int[] nums) {
        qSort(nums, 0, nums.length - 1);

        //众数超过n/2个，所以中间的那个一定是众数
        return nums[nums.length >> 1];
    }

    private void qSort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                ++i;
            }
            while (arr[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        qSort(arr, head, j);
        qSort(arr, i, tail);
    }

    //摩尔投票法,先假设第一个数过半数并设cnt=1；
    //遍历后面的数如果相同则cnt+1，不同则减一，当cnt为0时则更换新的数字为候选数（成立前提：有出现次数大于n/2的数存在）
    int majorityElementVoat(int[] nums) {
        int res = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                res = nums[i];
                cnt++;
            } else {
//                cnt = (res==nums[i]) ? cnt++ : cnt--;
                if (res == nums[i]) cnt++;
                else cnt--;
            }
        }
        return res;
    }


}
