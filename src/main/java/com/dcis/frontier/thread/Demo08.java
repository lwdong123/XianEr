package com.dcis.frontier.thread;

public class Demo08 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("第一个线程：" + i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("第二个线程：" + i);
				}
			}
		});
		// 如果有多个线程同时存在，分别调用start方法以后只是将当前的这个线程纳入到线程
		// 调度机制中去，根据调度算法，此时只有当线程竞争到时间片以后才会进入到执行状态
		// 那些没有竞争到时间片的线程就处于等待状态，直到获取时间片才执行
		// 最终线程的执行顺序不是有代码中书写的顺序决定的，而是有调度机制决定的
		t1.start();
		t2.start();
	}
}
