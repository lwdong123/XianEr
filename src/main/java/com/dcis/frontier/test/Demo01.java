package com.dcis.frontier.test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 你的名字
 * @date 2020\2\5 0005 23:17
 */
public class Demo01 {
    public static void main(String[] args) {
     Demo01.run();

    }

    public void run1() {
        run();
    }

    public static void run() {
        HashMap<Object, Object> map1 = new HashMap<>();
        HashMap<Object, Object> map2 = new HashMap<>();
        map1.put("a1", "11");
        map2.put("a2", "14");
        map2.put("a3", "14");
        map2.put("a4", "14");
        map2.put("a5", "14");
        map2.put("a6", "14");
        map2.put("a7", "14");
        map1.putAll(map2);
        System.out.println("22222222222");
        ArrayList<Object> objects = new ArrayList<>();
        objects.forEach(System.out::println);
    }
}
