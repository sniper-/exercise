package com.excercise.LeetCode;

/**
 * ClassName: S495
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/17 14:21
 */
public class S495 {
    public S495() {
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length<1){
            return 0;
        }
        int count=0;
        for(int i=0; i<timeSeries.length-1; i++){
            if(timeSeries[i]+duration < timeSeries[i+1]){
                count += duration;
            }else{
                count += (timeSeries[i+1]-timeSeries[i]);
            }
        }
        return count+duration;
    }
}
