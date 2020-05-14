package com.ssm.demoTest;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        int size = new ArrayList<>().size();
        System.out.println(size);

        String[] str = {"A", "", "","b"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(str.toString());

        HashMap<Object, Object> map = new HashMap<>();
        map.put("1","");
        map.put("2","");
        map.put("3","lin");
        System.out.println(map);
        for (int i = 0; i < 10; i++) {
            System.out.println("11111");
        }

    }
}
