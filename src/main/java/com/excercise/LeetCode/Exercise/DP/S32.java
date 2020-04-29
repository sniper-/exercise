package com.excercise.LeetCode.Exercise.DP;

import java.util.Stack;

/**
 * ClassName: S32
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/28 10:36
 */
public class S32 {

    public S32() {
    }

    //有效括号数量
//    public int sumValidParentheses(String s) {
//        int cnt = 0;
//        Stack<Character> stack = new Stack<>();
//        for(char c : s.toCharArray()){
//            if(c == '('){
//                stack.push(c);
//            }else if(c==')' && !stack.empty()){
//                stack.pop();
//                cnt+=2;
//            }
//        }
//        return cnt;
//    }

    //暴力超时
//    public int longestValidParentheses(String s) {
//        int maxlen = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                int cnt = 0;
//                Stack<Character> stack = new Stack<>();
//                for (int k = i; k <= j; k++) {
//                    if (s.charAt(k) == '(') {
//                        stack.push(s.charAt(k));
//                    } else if (!stack.empty() && stack.peek() == '(') {
//                        stack.pop();
//                        cnt += 2;
//                    } else {
//                        cnt = 0;
//                        break;
//                    }
//                }
//                if (stack.empty()) {
//                    maxlen = Math.max(maxlen, cnt);
//                }
//            }
//        }
//
//        return maxlen;
//    }

    

}
