package com.dcis.frontier.test;

public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance==null) {
            //多线程中双重检查
            synchronized (Singleton.class){
                //第一个线程创建实例，第二个再次判断不为null就不再创建
                if (instance==null) {
                    new Singleton();
                }
            }
        }
        return instance;
    }
}
