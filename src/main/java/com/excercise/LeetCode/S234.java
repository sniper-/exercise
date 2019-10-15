package com.excercise.LeetCode;

/**
 * ClassName: S234
 * Version:
 * Description:
 *
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/08 14:34
 */
public class S234 {
    public S234() {
    }


    /**
     * Description: O(n),O(n)
     *   新建一个反转链表，每个值都相等则为回文链表
     * @Param: [head]
     * @return: boolean
     * @Author: sniper
     * @Date: 2019/10/8 14:34
     */
    public boolean isPalindromeAll(ListNode head) {

        if(head == null){
            return true;
        }
        ListNode cur = new ListNode(head.val);
        ListNode p = head;
        while (p.next != null) {
            ListNode next = new ListNode(p.next.val);
            p = p.next;
            next.next = cur;
            cur = next;
        }
        while(cur != null){
            if(head.val != cur.val){
                return false;
            }
            cur = cur.next;
            head = head.next;
        }
        return true;
    }

    /**
     * Description: O(n),O(n)
     *   使用快慢指针找中点，翻转前半部分链表同后半部分作对比
     * @Param: [head]
     * @return: boolean
     * @Author: sniper
     * @Date: 2019/10/8 14:34
     */
    public boolean isPalindromeHalf(ListNode head){
        //TODO
        return true;
    }

    /**
     * Description: O(n),O(1)
     *   数学方法，遍历一遍，链表转数字，若相等则为回文链表
     * @Param: [head]
     * @return: boolean
     * @Author: sniper
     * @Date: 2019/10/8 14:34
     */
    public boolean isPalindromeMath(ListNode head){
        float s1 = 0,s2 = 0,t = 1;

        while(head != null) {
            s1 = s1*10 + head.val;
            s2 = s2 + t*head.val;
            t = t*10;
            head = head.next;
        }
        return s1 == s2;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
