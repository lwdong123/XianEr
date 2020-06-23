package com.dcis.frontier.thread;

/**
 * void join() 该方法用于等待当前线程的结束
 * 
 * @author Administrator
 *
 */
public class Demo16 {
	public static void main(String[] args) {
		// 浏览网页图片
		// 线程1：负责从服务器端下载图片
		// 线程2：负责显示图片
		Thread downloadThread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("当前已经下载了：" + (i * 10) + "%");

				}
			}
		});

		Thread showImageThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					// 用来等待下载线程执行完毕以后再去执行显示线程
					downloadThread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("下载完毕，开始显示图片......");

			}
		});
		downloadThread.start();
		showImageThread.start();

	}

}
