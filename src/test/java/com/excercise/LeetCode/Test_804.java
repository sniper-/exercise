package com.excercise.LeetCode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Test_804 {
    S804 s804 = new S804();

    @Test
    public void test804(){
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
}