package com.dcis.frontier.thread;

/**
 * String getName()/void setName(String threadName) 获取/设置线程名
 * 
 * @author Administrator
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("主线程");
		System.out.println(t1.getName());

		Thread t2 = new Thread();
		t2.setName("自定义线程");
		System.out.println(t2.getName());
	}
}
