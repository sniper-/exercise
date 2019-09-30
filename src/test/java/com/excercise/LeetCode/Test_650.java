package com.excercise.LeetCode;

import org.junit.Test;

/**
 * Description: AC
 *
 * @Program:
 * @Author: sniper
 * @Date: 201909 10:08
 */
public class Test_650 {
    LeetCode650 leetCode650 = new LeetCode650();

    @Test
    public void TestRecursive(){
        int steps = leetCode650.minStepsRecursive(36);
        System.out.println(steps);
    }

    @Test
    public void TestNonRecursive(){
        int steps = leetCode650.minStepsNonRecursive(36);
        System.out.println(steps);
    }

}
