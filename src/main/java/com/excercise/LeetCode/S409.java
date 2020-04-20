package com.excercise.LeetCode;

public class S409 {
    public int longestPalindrome(String s) {
        int[] p = new int[52];
        int count=0;
        char[] cs = s.toCharArray();

        for(char tmp : cs){
            int i = (tmp -65)>31 ? tmp-71 : tmp-65;
            p[i]++;
        }

        for(int t : p){
            count += t%2==0?t:(count%2==0?t:t-1);
//            if(t%2==0){
//                count+=t;
//            }else{
//                if(count%2==0){
//                    count+=t;
//                }else{
//                    count+=t-1;
//                }
//            }
        }
        return count;
    }
}
