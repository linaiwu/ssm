package com.ssm.demoTest;

import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {

        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("1","sex");
        System.out.println(hashMap.get("1"));
    }
}
