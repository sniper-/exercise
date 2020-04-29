package com.excercise.LeetCode.Exercise;

import com.excercise.LeetCode.Exercise.DP.S1035;
import com.excercise.LeetCode.Exercise.Others.S1010;
import com.excercise.LeetCode.Exercise.Others.S1021;
import org.junit.Test;

import java.io.*;

/**
 * ClassName: Test1001_1100
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2020/04/29 09:22
 */
public class Test1001_1100 {
    public Test1001_1100() {
    }

    @Test
    public void test1010() {
        S1010 s1010 = new S1010();

        int res = 0;
        int[] src1 = {30, 20, 150, 100, 40}; //res=3
        int[] src2 = {60, 60, 60}; //res=3
        int[] src3 = new int[38416]; //res=12297853
        int count = 0;

        try {
            InputStream file = new FileInputStream("src/main/resources/LeetCode1010.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file));

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                src3[count++] = Integer.parseInt(str);
            }

            file.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        res = s1010.solutionPass(src3);
        System.out.println(res);
    }

    @Test
    public void test1021() {
        S1021 s1021 = new S1021();

        System.out.println(s1021.removeOuterParentheses(""));
        System.out.println(s1021.removeOuterParentheses("(()())(())"));
        System.out.println(s1021.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(s1021.removeOuterParentheses("()()"));
    }

    @Test
    public void test1035(){
        S1035 s1035 =  new S1035();
//        int[] A = {1,3,7,1,7,5};
//        int[] B = {1,9,2,5,1};
//        int[] A = {2,5,1,2,5};
//        int[] B = {10,5,2,1,5,2};
//        int[] A = {1};
//        int[] B = {1,3};
        int[] A = {1,1,2,1,2};
        int[] B = {1,3,2,3,1};
        System.out.println(s1035.maxUncrossedLines(A, B));
    }
}
