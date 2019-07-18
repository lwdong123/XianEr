package com.example.dcits.test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 你的名字
 * @date 2019\7\15 0015 9:16
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 7,3,4,13,11};
        int sum = 0;
        int sum2=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                sum++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        int[] a = {6, 5, 2, 7,3,4,13,11};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                sum2++;
            }

        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum2);


    }

    }
