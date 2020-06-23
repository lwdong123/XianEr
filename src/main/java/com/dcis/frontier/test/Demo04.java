package com.dcis.frontier.test;

public class Demo04 {
    public static void main(String[] args) {
        //冒泡排序
        int[] a = {11, 2, 4, 13, 5,1};
        int temp=0;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length-i; j++) {

                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
