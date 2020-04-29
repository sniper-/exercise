package com.excercise.LeetCode.Exercise;

import com.excercise.LeetCode.Exercise.DP.S409;
import com.excercise.LeetCode.Exercise.Others.S448;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: Test401_500
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/17 09:29
 */
public class Test401_500 {

    @Test
    public void test409(){
        S409 s409 = new S409();
        System.out.println(s409.longestPalindrome("aaaAaaaa"));
    }

    @Test
    public void test448() {
        S448 s448 = new S448();
        int[] src1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> res = s448.findDisappearedNumbers(src1);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    public Test401_500() {
    }


}
