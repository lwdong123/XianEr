package com.dcis.frontier.thread;

/**
 * State getState():获取线程的状态
 * 
 * @author Administrator
 *
 */
public class Demo22 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		// NEW:线程实例化以后但是从未执行start()方法时的状态
		System.out.println(t1.getState());
		t1.start();
		// RUNNABLE：线程进入运行的状态（可能是正在运行，也有可能是就绪状态）
		System.out.println(t1.getState());
	}
}
