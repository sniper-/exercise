package com.excercise.LeetCode;

/**
 * ClassName: S289
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/14 09:24
 */
public class S289 {
    public S289() {
    }

    public void GameOfLife(int[][] board){
        int count;
        //构建一个同board值相同，但是周围都是0边界的镜像数组
        //1、初始化一个比board阵列大一圈的阵列，并赋值为0
        int[][] withEdge = new int[board.length+2][board[0].length+2];

        //2、传入的阵列board的值
        for(int row=0;row<withEdge.length;row++){
            for(int col=0;col<withEdge[0].length;col++){
                withEdge[row+1][col+1] = board[row][col];
            }
        }

        //以withEdge为参考，直接更新board中的值并输出即可
        for(int row=0;row<withEdge.length;row++){
            for(int col=0;col<withEdge[0].length;col++){
                //边界值0并不影响判定结果，不需要考虑四边和四角边界处理
                count = 0;
                count += withEdge[row][col];
                count += withEdge[row][col+1];
                count += withEdge[row][col+2];
                count += withEdge[row+1][col];
                count += withEdge[row+1][col+2];
                count += withEdge[row+2][col];
                count += withEdge[row+2][col+1];
                count += withEdge[row+2][col+2];

                switch (count){
                    //这些状态无论0,1都会变为0
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        board[row][col] = 0;
                    //这些状态无论0,1都会变为1
                    case 3:
                        board[row][col] = 1;
                    //其余情况状态不变，不需要处理
                }
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.println(board[i][j]);
            }
        }
    }
}
