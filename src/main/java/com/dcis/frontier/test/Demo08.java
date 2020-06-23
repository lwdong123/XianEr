package com.dcis.frontier.test;

public class Demo08 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        thread1.start();
        thread2.start();

    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
       get01();
    }

    public synchronized static void get01(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"----2");
        }
    }
    public synchronized static  void get02(){
        synchronized (MyThread.class){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"---1");
            }
        }
    }
}
