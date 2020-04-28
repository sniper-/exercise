package com.excercise.LeetCode.Exercise;

/**
 * ClassName: S1010
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/17 14:39
 */
public class S1010 {
    public S1010() {
    }

    public int numPairsDivisibleBy60(int[] time) {
        /**
         * Description: O(n^2)超时 超时 超时
         * @Param: [time]
         * @return: int
         * @Author: sniper
         * @Date: 2019/10/17 14:57
         */
        if (time.length == 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < time.length - 1; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int solutionPass(int[] time) {
        /**
         * Description: O(n)
         * @Param: [time]
         * @return: int
         * @Author: sniper
         * @Date: 2019/10/17 15:10
         */
        if (time.length == 1) {
            return 0;
        }
        int count = 0;
        int nums[] = new int[60];
        for (int x : time) {
            //打表标注余数出现次数
            nums[x % 60]++;
        }
        for (int i = 1; i < 30; i++) {
            //每个num[i]同每个nums[60-i]之和都是60倍数
            count += (nums[i] * nums[60 - i]);
        }
        //统计余数是0和30的数量
        count += ((nums[0] * (nums[0] - 1)) / 2);
        count += ((nums[30] * (nums[30] - 1)) / 2);

        return count;
    }
}
