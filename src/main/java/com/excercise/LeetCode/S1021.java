package com.excercise.LeetCode;

/**
 * ClassName: S1021
 * Version:
 * Description: Solution for LeetCode 1021
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/14 15:25
 */
public class S1021 {
    public S1021() {
    }

    public String removeOuterParentheses(String S) {
        /**
         * Description: O(n),O(n)
         * @Param: [S]
         * @return: java.lang.String
         * @Author: sniper
         * @Date: 2019/10/14 17:09
         */
        if (null == S) return "";
        int count = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                count++;
                if (count > 1) {
                    //第一次遇到的左括号一定是最外层括号，跳过后剩下的可以加入
                    res.append(S.charAt(i));
                }
                continue;
            }
            if (S.charAt(i) == ')') {
                if (count > 1) {
                    //将对应的有括号加入
                    res.append(S.charAt(i));
                    count--;
                } else {
                    //最后一层有括号不添加，重置count，添加下一组
                    count = 0;
                }

            }
        }
        return res.toString();
    }

    public String removeOuterParentheses1(String S) {
        //TODO:考虑使用深搜或者广搜思想
        return "";
    }
}