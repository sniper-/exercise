package com.excercise.LeetCode;

import com.excercise.LeetCode.DataStructure.MyCircularQueue;
import org.junit.Test;

public class MyQ {

    @Test
    public void testQ(){
//        int a[] = {0,1,2,3};
//        int i=0;
//        System.out.println(++i);
//        System.out.println(a[++i%4]);
//        System.out.println(a[++i%4]);
//        System.out.println(a[++i%4]);
//        System.out.println(a[++i%4]);
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
