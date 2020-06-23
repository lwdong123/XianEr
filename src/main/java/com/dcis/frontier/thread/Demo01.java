package com.dcis.frontier.thread;

/**
 * 线程的创建-继承Thread类
 * 
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		// 创建线程对象
		Thread t1 = new MyThread1();
		// 调用其中的start()方法
		// main:主线程
		// t1.run();// Thread[main,5,main]

		// Thread-0:新开启的线程
		t1.start();// Thread[Thread-0,5,main]

		// Thread类是线程类，其每一个实例表示一个可以并发执行的线程。可以通过继承该类，并重写run方法来定义
		// 一个新的线程
		// 启动线程要调用线程的start方法而非直接调用run方法
		// start方法会将当前线程纳入线程调度，使当前线程可以进行并发执行
		// 一旦当前这个线程获取到时间片以后就自动调用run方法来执行其中的逻辑
		// 当线程获取时间片执行以后，只有当run方法结束或遇到人为的挂起，run方法会停止执行
		// 虽然run方法可以指定代码逻辑，但是依然是在主线程中执行的，没有到达多线程的效果

		Thread t2 = new MyThread1();
		t2.start();
	}
}

/**
 * 新建一个类，继承Thread类，这个类就是一个线程类
 * 
 * @author Administrator
 *
 */
class MyThread1 extends Thread {
	// 线程中需要做什么事情，就在这里定义
	// 在重写Thread类中run方法时，在方法中去编写该线程所要完成的逻辑
	@Override
	public void run() {
		// Thread.currentThread():获取当前执行这段代码的线程
		System.out.println(Thread.currentThread() + "I am a new Thread...");
	}

}