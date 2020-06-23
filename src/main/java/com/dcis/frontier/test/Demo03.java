package com.dcis.frontier.test;

import java.util.Arrays;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        //选择排序
        int[] a = {11, 2, 4, 13, 5,1};
        int temp=0;
        for (int i = 0; i <a.length-1; i++) {
            for (int j = i+1; j <a.length; j++) {
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
