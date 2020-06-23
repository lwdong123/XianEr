package com.dcis.frontier.thread;

/**
 * boolean isAlive() 测试线程是否处于活动状态
 * 
 * @author Administrator
 *
 */
public class Demo14 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread01...");

			}
		});
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
	}
}
