package com.excercise.LeetCode.Exercise.Others;

/**
 * Description:
 * <p>
 * 650.2 Keys Keyboard
 * Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:
 * <p>
 * Copy All: You can copy all the characters present on the notepad (partial copy is not allowed).
 * Paste: You can paste the characters which are copied last time.
 * <p>
 * <p>
 * Given a number n. You have to get exactly n 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.
 * <p>
 * Example 1:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation:
 * Intitally, we have one character 'A'.
 * In step 1, we use Copy All operation.
 * In step 2, we use Paste operation to get 'AA'.
 * In step 3, we use Paste operation to get 'AAA'.
 * <p>
 * <p>
 * Note:
 * <p>
 * The n will be in the range [1, 1000].
 *
 * @Program:
 * @Author: sniper
 * @Date: 20190929 10:07
 */
public class S650 {
    /**
     * Recursive
     */
    public int minStepsRecursive(int n) {
        if (n == 1) {
            return 1;
        }

        int maxDivisor = maxDivisor(n);
        if (maxDivisor == 0) {
            return n;
        }else {
            return n / maxDivisor + minStepsRecursive(maxDivisor);
        }
    }

    private int maxDivisor(int x) {
        int theOne = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                theOne = i;
            }
        }
        return theOne;
    }

    /**
     * Non-Recursive
     */
    public int minStepsNonRecursive(int x) {
        int theOne = 0;
        for (int i = 2; i <= x; i++) {
            while (x % i == 0) {
                theOne += i;
                x /= i;
            }
        }
        return theOne;
    }
}
