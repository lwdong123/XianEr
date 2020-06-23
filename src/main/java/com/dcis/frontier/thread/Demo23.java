package com.dcis.frontier.thread;

/**
 * 线程状态-TERMINATED
 * 
 * @author Administrator
 *
 */
public class Demo23 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		// System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t1.getState());

	}
}
