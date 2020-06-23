package com.dcis.frontier.test;

public class Demo07 {
    public static void main(String[] args) {
        Demo07 demo07 = new Demo07();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (demo07){
                    for (int i = 0; i <100 ; i++) {
                        System.out.println("线程执行"+Thread.currentThread().getName());
                    }
                }
            }

        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public  void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("线程执行"+Thread.currentThread().getName());
                }
            }
        });
        thread1.start();
        thread2.start();

    }
    public void test01(){


    }
}
