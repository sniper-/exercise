package com.excercise.LeetCode.Exercise.DP;

/**
 * ClassName: S1035
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/14 09:07
 */
public class S1035 {
    public S1035() {
    }

    public int maxUncrossedLines(int[] A, int[] B) {
        /**
         * Description: 动态规划为正确解法
         * @Param: [A, B]
         * @return: int
         * @Author: sniper
         * @Date: 2020/4/14 13:26
         */
        int n1 = A.length;
        int n2 = B.length;
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(A[i]==B[j]){
                    dp[i+1][j+1] = dp[i][j]+1;
                }else{
                    dp[i+1][j+1] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[n1][n2];
    }
    /**
     *  public int maxUncrossedLines(int[] A, int[] B) {
     *
     * Description: 未考虑到从A数组舍弃一部分值的情况，未能AC
     * @Param: [A, B]
     * @return: int
     * @Author: sniper
     * @Date: 2020/4/14 13:25
     *         int sum=0;
     *         int max=0;
     *         for(int n=0;n<A.length;n++){
     *             max = (sum>max) ? sum : max;
     *             sum=0;
     *             int pos=0;
     *             for(int i=n;i<A.length;i++){
     *                 for(int j=pos;j<B.length;j++){
     *                     if( A[i] == B[j] ){
     *                         sum++;
     *                         pos=j+1;
     *                         break;
     *                     }else{
     *                         continue;
     *                     }
     *                 }
     *             }
     *         }
     *
     *         return  (sum>max) ? sum : max;
     *     }
     */
}
