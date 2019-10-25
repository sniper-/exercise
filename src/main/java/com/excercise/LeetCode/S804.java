package com.excercise.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: S804
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/14 17:41
 */
public class S804 {
    public S804() {
    }

    public int uniqueMorseRepresentations(String[] words) {
//        Map<String, String> morseKV = new HashMap<>(36);
        int count = 0;
        char[] key = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] val = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> res = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            //将words中所有明文翻译为密文
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                //将key对应的val密文放入s
                s.append(val[words[i].charAt(j) - 97]);
            }
            //将一个words[i]对应的密文放入res
            res.add(s.toString());
        }

        //res已经含有所有words中的密文
        return res.size();
    }
}
