package com.excercise.LeetCode;

import com.excercise.LeetCode.DataStructure.MyCircularQueue;
import org.junit.Test;

/**
 * ClassName: Q_Stack
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/23 16:46
 */
public class Q_Stack {
    public Q_Stack() {
    }

    @Test
    public void testQ(){
         MyCircularQueue obj = new MyCircularQueue(3);
         System.out.println(obj.enQueue(1));
         System.out.println(obj.enQueue(2));
         System.out.println(obj.enQueue(3));
         System.out.println(obj.enQueue(4));
         System.out.println(obj.Rear());
         System.out.println(obj.isFull());
         System.out.println(obj.deQueue());
         System.out.println(obj.enQueue(4));
         System.out.println(obj.Rear());
    }
}
