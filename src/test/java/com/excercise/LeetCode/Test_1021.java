package com.excercise.LeetCode;

import com.excercise.LeetCode.Exercise.*;
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

    @Test
    public void test289(){
        S289 s289 = new S289();
        int[][] input = {{1,2,3},{4,5,6}};
        s289.GameOfLife(input);
    }

    @Test
    public void test1035(){
        S1035 s1035 =  new S1035();
//        int[] A = {1,3,7,1,7,5};
//        int[] B = {1,9,2,5,1};
//        int[] A = {2,5,1,2,5};
//        int[] B = {10,5,2,1,5,2};
//        int[] A = {1};
//        int[] B = {1,3};
        int[] A = {1,1,2,1,2};
        int[] B = {1,3,2,3,1};
        System.out.println(s1035.maxUncrossedLines(A, B));
    }

    @Test
    public void test673(){
        S673 s673 = new S673();
        int[] in = {1,2,4,3,5,4,7,2};
        System.out.println(s673.findNumberOfLIS(in));
    }

    @Test
    public void test5(){
        S5 s5 = new S5();
        String s = "baad";

        System.out.println(s5.longestPalindrome(s));
//        System.out.println(s.substring(1,2));
    }
}
