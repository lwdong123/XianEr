package com.dcis.frontier.thread;

/**
 * long getId() 返回该线程的标识符
 * 
 * @author Administrator
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		// 因为在JVM中除了用户自己创建的线程以外，
		// 也有虚拟机自动为用户创建的一些线程
		// 所以自定义线程的标识符一定不是从1开始的
		// 1-main线程
		Thread t1 = new Thread();
		System.out.println(t1.getId());
		Thread t2 = new Thread();
		System.out.println(t2.getId());
		System.out.println(Thread.currentThread().getId());
	}
}
