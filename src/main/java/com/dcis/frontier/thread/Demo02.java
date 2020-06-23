package com.dcis.frontier.thread;

/**
 * 线程的创建-实现Runnable接口
 * 
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2());
		t1.start();
		Thread t2 = new Thread(new MyThread2());
		t2.start();
	}
}

/**
 * 通过实现Runnable接口来创建一个线程类
 * 
 * @author Administrator
 *
 */
class MyThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + "这是一个线程");
	}
}