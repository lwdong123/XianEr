package com.dcis.frontier.thread;

/**
 * void yield() 该方法用于使当前线程主动让出当次CPU时间片回到就绪状态，等待时间片分配。使得多个线程的执行更和谐，但是保证不了严格交替执行。
 * 
 * @author Administrator
 *
 */
public class Demo18 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + "->" + i);
					Thread.yield();
				}
			}
		}, "线程1");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + "->" + i);
					Thread.yield();
				}
			}
		}, "线程2");
		t1.start();
		t2.start();
	}
}
