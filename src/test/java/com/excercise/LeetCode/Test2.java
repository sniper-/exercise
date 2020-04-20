package com.excercise.LeetCode;

import org.junit.Test;

import java.util.List;

/**
 * ClassName: Test2
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/22 09:42
 */
public class Test2 {
    public Test2() {
    }

    @Test
    public void test409(){
        S409 s409 = new S409();
        System.out.println(s409.longestPalindrome("aaaAaaaa"));
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

        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(8);
        a1.next = a2;
        ListNode b1 = new ListNode(0);

        S2 s2 = new S2();
        ListNode res = s2.addTwoNumbersSum(a1, b1);
        while (null != res) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
