package com.excercise.LeetCode;

import com.excercise.LeetCode.Exercise.S448;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: Test448
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/18 09:53
 */
public class Test448 {
    S448 s448 = new S448();

    public Test448() {
    }

    @Test
    public void test448() {
        int[] src1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> res = s448.findDisappearedNumbers(src1);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

}
