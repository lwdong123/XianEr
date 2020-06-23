package com.dcis.frontier.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(4);
        objects.add(3);
        objects.add(2);
        objects.stream().filter(a -> "2".equals(a) ).collect(Collectors.toList());
        System.out.println(objects);
        ArrayList<Map> map = new ArrayList<>();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("1", 1);
        objectObjectHashMap.put("2", 2);
        map.add(objectObjectHashMap);
        List<Object> collect = map.stream().map(a -> a.get("1")).collect(Collectors.toList());
        System.out.println(collect);

    }

}
