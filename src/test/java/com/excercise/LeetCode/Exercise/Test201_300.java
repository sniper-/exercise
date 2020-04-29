package com.excercise.LeetCode.Exercise;

import com.excercise.LeetCode.Exercise.Others.S289;
import org.junit.Test;

/**
 * ClassName: Test201_300
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/16 15:33
 */
public class Test201_300 {

    public Test201_300() {
    }

    @Test
    public void test289(){
        S289 s289 = new S289();
        int[][] input = {{1,2,3},{4,5,6}};
        s289.GameOfLife(input);
    }

}
