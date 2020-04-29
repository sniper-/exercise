package com.excercise.LeetCode.Exercise;

import com.excercise.LeetCode.Exercise.Others.S804;
import com.excercise.LeetCode.Exercise.Others.S832;
import org.junit.Test;

public class Test801_900 {
    S804 s804 = new S804();

    @Test
    public void test804() {
        String[] words = {"gin", "zen", "gig", "msg"};
//        Set<String> nameSet = new HashSet<String>();
//        nameSet.add("1");
//        nameSet.add("1");
//        nameSet.add("2");
//        nameSet.add("3");
//        for(String i:nameSet){
//            System.out.println(i);
//        }
        System.out.println(s804.uniqueMorseRepresentations(words));
    }

    @Test
    public void test832() {
        S832 s832 = new S832();
        int[][] src1 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] src2 = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] src3 = {{1}};
        int[][] res = s832.flipAndInvertImage(src3);
        for (int[] tmp : res) {
            for (int i = 0; i < tmp.length; i++) {
                System.out.println(tmp[i]);
            }
        }
    }
}
