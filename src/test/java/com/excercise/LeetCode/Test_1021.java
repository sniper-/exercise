package com.excercise.LeetCode;

import org.junit.Test;

/**
 * ClassName: Test_1021
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/14 16:26
 */
public class Test_1021 {
    S1021 s1021 = new S1021();


    @Test
    public void test1021() {
        System.out.println(s1021.removeOuterParentheses(""));
        System.out.println(s1021.removeOuterParentheses("(()())(())"));
        System.out.println(s1021.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(s1021.removeOuterParentheses("()()"));
    }
}
