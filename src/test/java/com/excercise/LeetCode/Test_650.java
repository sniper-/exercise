package com.excercise.LeetCode;

import com.excercise.LeetCode.Exercise.S650;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Description: AC
 *
 * @Program:
 * @Author: sniper
 * @Date: 201909 10:08
 */
public class Test_650 {
    S650 leetCode650 = new S650();

    @Test
    public void TestRecursive() {
        int steps = leetCode650.minStepsRecursive(36);
        System.out.println(steps);
    }

    @Test
    public void TestNonRecursive() {
        int steps = leetCode650.minStepsNonRecursive(36);
        System.out.println(steps);
    }

    @Test
    public void test11() {
        String s = "{\"marketAcctNo\":\"083\",\"markId\":\"MB3017\",\"name\":\"\\u9646\\u60df\\u660a\",\"idType\":\"1\",\"idNo\":\"31011519850310299X\",\"phoneNo\":\"13730099864\",\"nation\":\"cn\",\"email\":\"1@111.com\",\"tranMode\":1,\"bankProId\":\"B002\",\"cardNo\":\"325290000012\"}";
        JSONObject json = JSONObject.parseObject(s);
        Map<String, Object> map = json;

        System.out.println("test");

    }

}
