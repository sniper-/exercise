package com.excercise.LeetCode;

/**
 * ClassName: S206
 * Version:
 * Description:
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/09/30 15:06
 */
public class S206 {
    public S206() { }

    /**
     * Description: 迭代
     * @Param: [head]
     * @return: com.excercise.LeetCode.S206.ListNode
     * @Author: sniper
     * @Date: 2019/9/30 15:07
     */
    public ListNode reverseList(ListNode head) {

        if(head==null) return null;
        ListNode p = head;
        ListNode tail = p.next;
        while(tail!=null){
            p.next=tail.next;
            tail.next=head;
            head=tail;
            tail=p.next;
        }
        return head;
    }

    //TODO:递归版本

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
