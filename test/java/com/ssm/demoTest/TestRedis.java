package com.ssm.demoTest;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRedis {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("39.106.204.23");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());

//        Map<String, String> map=new HashMap<>();
//        map.put("code", "0591");
//        map.put("name", "福建");
//
//        //调用jedis的hmset(存入hash map)的方法将map的键值对存进去
//        jedis.hmset("city", map);
//        List<String> people = jedis.hmget("people");
//
//        System.out.println(people);
        Map<String, String> people = jedis.hgetAll("people");
        System.out.println(people);
        String age = jedis.get("age");
        System.out.println(age);
        String hget = jedis.hget("people", "age");
        System.out.println(hget);
        List<String> hmget = jedis.hmget("people", "age", "sex", "height", "name");
        System.out.println(hmget);

        System.out.println();


    }
}
