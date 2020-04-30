package com.excercise.LeetCode.DataStructure;

import org.junit.Test;

/**
 * ClassName: TestWallsAndGates
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/30 11:12
 */
public class TestWallsAndGates {
    public TestWallsAndGates() {
    }

    @Test
    public void wallsAndGates(){
        WallsAndGates wg = new WallsAndGates();
        int maxVal = Integer.MAX_VALUE;
        int[][] rooms = new int[][]{{maxVal, -1, 0, maxVal}, {maxVal, maxVal, maxVal, -1}, {maxVal, -1, maxVal, -1}, {0, -1, maxVal, maxVal}};
        wg.wallsAndGates(rooms);
    }
}
