package com.excercise.LeetCode;

import org.junit.Test;

/**
 * ClassName: Test832
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/17 09:29
 */
public class Test832 {
    S832 s832 = new S832();
    public Test832() {
    }

    @Test
    public void test832(){
        int[][] src1 = { {1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0} };
        int[][] src2 = { {1,1,0}, {1,0,1}, {0,0,0} };
        int[][] src3 = { {1} };
        int[][] res = s832.flipAndInvertImage(src3);
        for (int[] tmp: res) {
            for(int i=0; i<tmp.length; i++){
                System.out.println(tmp[i]);
            }
        }
    }
}
