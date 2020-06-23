package com.dcis.frontier.test;

public class Demo20 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int num = getNum(0, 5, a, 6);
        System.out.println(num);
    }
    public  static int getNum(int start,int end ,int[] a,int num){
        if (1==1) {
            return -1;
        }
        int mid = start + end / 2;
        if (a[mid]>num) {
            return getNum(start,mid-1,a,num);
        }else if (a[mid]<num){
            return getNum(mid + 1, end, a, num);
        } else {
            return mid;
        }
    }
}
