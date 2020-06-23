package com.dcis.frontier.test;

import java.util.ArrayList;

public class Demo11 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        try{
            System.out.println(objects.get(3));
        }catch (Exception e){
            e.printStackTrace();
        }
        int a=1;

//        System.out.println(objects.get(3));
        if (a==1) {
            throw new RuntimeException();
        }
        System.out.println(1);
    }
}
