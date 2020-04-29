package com.excercise.LeetCode.Exercise.Others;

/**
 * ClassName: S2
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/21 17:54
 */
public class S2 {
    public S2() {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = new ListNode(0);
        res = head;

        int flag = 0;
        while (null != l1.next || null != l2.next) {
            if (null == l1.next) {
                ListNode next = new ListNode(l2.val + flag);
                head.next = next;
                head = res.next;
                flag = 0;
            } else if (null == l2.next) {
                ListNode next = new ListNode(l1.val + flag);
                head.next = next;
                head = res.next;
                flag = 0;
            } else {
                int val = l1.val + l2.val + flag;
                if (val > 10) {
                    ListNode next = new ListNode(val % 10);
                    head.next = next;
                    head = res.next;
                    flag = 1;
                }

            }

        }
        return res.next;
    }


    public ListNode addTwoNumbersSum(ListNode l1, ListNode l2) {

        int n1 = 0, n2 = 0, sum = 0, flag = 0;
        ListNode res = new ListNode(0);
        ListNode head = res;

        while (null != l1 || null != l2) {
            n1 = (null != l1) ? l1.val : 0;
            n2 = (null != l2) ? l2.val : 0;
            sum = flag + n1 + n2;
            flag = sum / 10;
            head.next = new ListNode(sum % 10);
            head = head.next;
            if (null != l1) l1 = l1.next;
            if (null != l2) l2 = l2.next;
        }
        if (flag > 0) {
            head.next = new ListNode(flag);
        }
        return res.next;
    }
}
