package com.excercise.LeetCode;

import com.excercise.LeetCode.Exercise.S1010;
import org.junit.Test;

import java.io.*;

/**
 * ClassName: Test1010
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/17 14:39
 */
public class Test1010 {
    S1010 s1010 = new S1010();

    public Test1010() {
    }

    @Test
    public void test1010() {
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
}
