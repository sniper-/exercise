package com.excercise.LeetCode.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: WallsAndGates
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/30 10:58
 */
public class WallsAndGates {
    private int steps(int row, int vol, int[][] rooms){
        int step = 0;
        int[] x = {-1, 0, 0, 1};
        int[] y = {0, -1, 1, 0};
        Queue<Integer> queue = new LinkedList<>();
        //从rooms[row][vol]开始做BFS并记录步数
//        for(int i=1; i<rooms.length-1; i++){
//            for(int j=1; j<rooms.length-1; j++){
//
//                if(rooms[i][j] != Integer.MAX_VALUE) {
//                    step += 1;
//                    for (int k = 0; k < x.length; k++) {
//                        if (rooms[i + x[k]][j + y[k]] == 0) {
//                            return step;
//                        }
//                    }
//                }
//            }
//        }
        return Integer.MAX_VALUE;
    }
    public void wallsAndGates(int[][] rooms) {
        int[] x = {-1, 0, 0, 1};
        int[] y = {0, -1, 1, 0};
        int step = 0;
        Queue<Integer> queue = new LinkedList<>();
        //rooms周围完全使用墙壁包围
        int[][] wRooms = new int[rooms.length+2][rooms.length+2];
        for(int i=0; i<wRooms.length; i++) {
            for (int j=0; j < wRooms.length; j++) {
                wRooms[i][j] = -1;
            }
        }
        for(int i=1; i<wRooms.length-1; i++) {
            for (int j=1; j < wRooms.length-1; j++) {
                wRooms[i][j] = rooms[i-1][j-1];
            }
        }

        //每个房间节点走一遍
//        for(int i=0; i<rooms.length; i++) {
//            for (int j=0; j < rooms.length; j++) {
//                int node;
//                queue.add(rooms[i][j]);
//                while(!queue.isEmpty()){
//                    step += 1;
//                    for (int k = 0; k < x.length; k++) {
//                        node = queue.peek();
//                        if (node == 0) {
//                            rooms[i][j] = step;
//                        } else if (node == Integer.MAX_VALUE){
//                            queue.add()
//                        }
//                    }
//                }
//                System.out.println(rooms[i][j]);
//            }
//        }
    }
}
