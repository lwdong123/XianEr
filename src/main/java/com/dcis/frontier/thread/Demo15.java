package com.dcis.frontier.thread;

/**
 * void sleep(long millis) 当前线程休眠指定毫秒数,只能等时间到了自动唤醒，如果强制唤醒，就会报错
 * 
 * @author Administrator
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
					if (i == 5) {
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}

			}
		}, "线程1");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}, "线程2");
		t1.start();
		t2.start();

		// t1和t2是两个并发执行的线程
		// 在一开始的时候，t1会非常快的打印1-5，打到5的时候，开始睡眠,在此期间t2也在并发执行，但是它会打一个数字停一秒
		// 当t1在睡眠时，t2继续执行，等到t1睡眠时间到了以后，t1继续执行，快速打印出6-10
		// 此时t2也会同时以每个一秒的速度继续打印其中没有打印完的部分
	}
}
