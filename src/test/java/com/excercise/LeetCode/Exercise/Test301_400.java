package com.excercise.LeetCode.Exercise;

import com.excercise.LeetCode.Exercise.DP.S322;
import com.excercise.LeetCode.Exercise.Others.S344;
import com.excercise.LeetCode.Exercise.Others.S448;
import org.junit.Test;

/**
 * ClassName: Test301_400
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/18 09:53
 */
public class Test301_400 {
    S448 s448 = new S448();

    public Test301_400() {
    }



    @Test
    public void test322(){
        S322 s322 = new S322();
        int[] coins = {1,2,5};
        System.out.println(s322.coinChange(coins, 100));
    }

    @Test
    public void testS344() {
        S344 s344 = new S344();

        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] s2 = {'h', 'e', 'l', 'l', 'o'};
        s344.reverseString(s2);
    }

}
