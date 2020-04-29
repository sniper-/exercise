package com.excercise.LeetCode.DataStructure;

import com.excercise.LeetCode.DataStructure.MovingAverage;
import org.junit.Test;

public class TestMA {
    @Test
    public void test11(){
        MovingAverage obj = new MovingAverage(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
        System.out.println(obj.next(7));

    }
}
