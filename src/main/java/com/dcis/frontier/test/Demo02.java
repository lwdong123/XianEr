package com.dcis.frontier.test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 你的名字
 * @date 2020\2\5 0005 23:17
 */
public class Demo02 {
    public static void main(String[] args) {
        Demo01.run();

    }

    public void run1() {
        run();
    }

    public static void run() {
        HashMap<Object, Object> map1 = new HashMap<>();
        HashMap<Object, Object> map2 = new HashMap<>();
        String[] aa = {"1", "1", "1"};
        map1.put("a1", "12");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");
        map1.put("a1", "11");


        map1.putAll(map2);
        System.out.println("22222222222");
        ArrayList<Object> objects = new ArrayList<>();
        objects.forEach(System.out::println);
    }
}
