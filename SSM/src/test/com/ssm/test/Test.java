package com.ssm.test;

import redis.clients.jedis.Jedis;

import javax.swing.*;
import java.util.*;

public class Test {

    @org.junit.Test
    public void test(){
        Jedis jedis=new Jedis("192.168.50.129",6379);
        //字符串的方式
        /*jedis.set("name","tomcat");
        System.out.println(jedis.get("name"));*/

        //list
       /* jedis.lpush("list","张三","男","湖南长沙");
        List<String> list= jedis.lrange("list",0,-1);
        for (String s : list) {
            System.out.println(s);
        }*/

       //hash
        /*Map<String,String> map=new HashMap<>();
        map.put("a","tomcat");
        map.put("b","java");
        map.put("c","html");
        jedis.hset("map",map);*/

        //System.out.println(jedis.hget("map", "a"));

        /*Map<String,String> redisMap=jedis.hgetAll("map");
        Iterator<String> it=redisMap.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            //通过键获取值
            String value= redisMap.get(key);

            System.out.println(key + "\t" + value);
        }*/

        //set
        jedis.sadd("set","小强","小红","小白");

        Set<String> set=jedis.smembers("set");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
