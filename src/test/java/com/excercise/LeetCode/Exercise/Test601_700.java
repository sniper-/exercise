package com.excercise.LeetCode.Exercise;

import com.excercise.LeetCode.Exercise.Others.S650;
import com.excercise.LeetCode.Exercise.Others.S673;
import org.junit.Test;

/**
 * Description: AC
 *
 * @Program:
 * @Author: sniper
 * @Date: 201909 10:08
 */
public class Test601_700 {
    S650 leetCode650 = new S650();

    @Test
    public void TestRecursive() {
        int steps = leetCode650.minStepsRecursive(36);
        System.out.println(steps);
    }

    @Test
    public void TestNonRecursive() {
        int steps = leetCode650.minStepsNonRecursive(36);
        System.out.println(steps);
    }

    @Test
    public void test673(){
        S673 s673 = new S673();
        int[] in = {1,2,4,3,5,4,7,2};
        System.out.println(s673.findNumberOfLIS(in));
    }

}
