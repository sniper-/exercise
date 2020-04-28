package com.excercise.LeetCode.DataStructure;

public class MovingAverage{
    double[] window;
    int size,tail,count;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        count = 0;
        window = new double[size];
        for(double win : window){
            win = 0;
        }
    }

    private void enQueue(int value) {
        tail = (tail + 1) % size;
        window[tail] = value;
    }

    public double next(int val) {
        double sum = 0.0;
        count = (count++ < 3) ? count : 3;
        enQueue(val);
        for(double win : window){
            sum += win;
        }

        return sum/count;
    }
}
