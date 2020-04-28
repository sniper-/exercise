package com.excercise.LeetCode.Exercise;

/**
 * ClassName: S832
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/17 09:27
 */
public class S832 {
    public S832() {
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int temp = 0;

        //翻转
        for (int i = 0; i < A.length; i++) {
            int end = A[i].length - 1;
            for (int j = 0; j < (A[i].length >> 1); j++) {
                temp = A[i][j];
                A[i][j] = A[i][end] ^ 1;
                A[i][end--] = temp ^ 1;
            }
            if (A[i].length % 2 == 1) {
                A[i][A[i].length >> 1] ^= 1;
            }
        }
        return A;
    }
}
