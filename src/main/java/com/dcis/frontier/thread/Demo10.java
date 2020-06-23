package com.dcis.frontier.thread;

/**
 * Thread.currentThread():获取当前执行这个代码段的线程
 * 
 * @author Administrator
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		// System.out.println("main方法中直接调用：" + Thread.currentThread());

		// test01();

		// Thread-0
		// new Thread(new MyThread3()).start();
		// main
		// new Thread(new MyThread3()).run();

		// new Thread(new MyThread3()).run();

		new Thread(new MyThread3()).start();

		// Thread[Thread-0,5,main]
		// Thread-0:线程名，可以通过构造方法自己指定
		// 5:线程的优先级，优先级决定了该线程获取时间片的几率，优先级越高，几率越高
		// main:线程组 ThreadGroup，线程组可以对一组线程进行统一的管理，对线程组操作就相当于对其中所有线程的操作
		// 默认情况下，所有的线程都属于main主线程组中

	}

	public static void test01() {
		System.out.println("test01()中调用：" + Thread.currentThread());
	}

}

class MyThread3 implements Runnable {
	@Override
	public void run() {
		System.out.println("run()方法中调用：" + Thread.currentThread());
		Demo10.test01();
	}
}
