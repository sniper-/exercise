package com.excercise.LeetCode.Exercise;

import com.excercise.LeetCode.Exercise.DP.S32;
import com.excercise.LeetCode.Exercise.DP.S5;
import com.excercise.LeetCode.Exercise.DP.S91;
import org.junit.Test;

/**
 * ClassName: Test1_100
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/22 09:42
 */
public class Test1_100 {
    public Test1_100() {
    }

    @Test
    public void test2() {
//        ListNode a1 = new ListNode(2);
//        ListNode a2 = new ListNode(4);
//        a1.next = a2;
//        ListNode a3 = new ListNode(3);
//        a2.next = a3;
//        ListNode b1 = new ListNode(5);
//        ListNode b2 = new ListNode(6);
//        b1.next = b2;
//        ListNode b3 = new ListNode(4);
//        b2.next = b3;

//        ListNode a1 = new ListNode(5);
//        ListNode a2 = new ListNode(8);
//        a1.next = a2;
//        ListNode b1 = new ListNode(0);
//
//        S2 s2 = new S2();
//        ListNode res = s2.addTwoNumbersSum(a1, b1);
//        while (null != res) {
//            System.out.println(res.val);
//            res = res.next;
//        }
    }

    @Test
    public void test5(){
        S5 s5 = new S5();
        String s = "baad";

        System.out.println(s5.longestPalindrome(s));
//        System.out.println(s.substring(1,2));
    }

    @Test
    public void test32(){
        S32 s32 = new S32();
        String in = ")()())";
//        String in = "(()";
//        System.out.println(s32.longestValidParentheses(in));
    }

    @Test
    public void test91(){
        S91 s91 = new S91();
        System.out.println((int)("226").charAt(1));
        System.out.println(s91.numDecodings("226"));
    }
}
