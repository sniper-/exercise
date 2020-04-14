package com.excercise.LeetCode;

/**
 * ClassName: S35
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/14 09:21
 */
public class S35 {
    public S35() {
    }

    public int searchInsert(int []nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] ==  target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}
