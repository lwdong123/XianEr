package com.dcis.frontier.thread;

/**
 * int getPriority()/void setPriority(int priority) 获取/设置线程的优先级
 * 
 * @author Administrator
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("线程1");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("线程2");
			}
		});
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
