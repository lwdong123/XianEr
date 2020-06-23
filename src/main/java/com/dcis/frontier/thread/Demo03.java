package com.dcis.frontier.thread;

/**
 * 通过匿名内部类的方式创建
 * 
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable()
		// 这里就是一个匿名内部类，相当于是Runnable接口的一个实现类
		// 只不过这个实现类只有这里会用到而已
		{
			@Override
			public void run() {
				System.out.println(Thread.currentThread() + ":线程1");
			}
		});
		t1.start();
	}
}
