package com.dcis.frontier.test;

public class Lamdba {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(
                Thread.currentThread().getName()
        )).start();


        Thread thread = new Thread();
        System.out.println(thread.currentThread().getName());
        thread.start();
    }
}
