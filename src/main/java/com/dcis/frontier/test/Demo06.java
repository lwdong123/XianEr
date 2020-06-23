package com.dcis.frontier.test;

public class Demo06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 33, 44, 55};
        System.out.println(binary2(a, 0, a.length - 1, 33));

    }

    public static int binary(int[] a, int start, int end, int send) {
        if (send < a[start] || send > a[end]) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (send == a[mid]) {
            return mid;
        } else if (send > a[mid]) {
            return binary(a, mid + 1, end, send);
        } else {
            return binary(a, start, mid - 1, send);
        }
    }

    public static int binary2(int[] a, int start, int end, int send) {
        if (send < a[start] || send > a[end]) {
            return -1;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            if (send == a[mid]) {
                return mid;
            } else if (send > a[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
