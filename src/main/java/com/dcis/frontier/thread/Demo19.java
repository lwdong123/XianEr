package com.dcis.frontier.thread;

/**
 * void setDaemon(boolean isDaemon) 当参数为true时，该线程为守护线程（在调用start方法之前，否则，会有异常）
 * 守护线程 当进程中只剩下守护线程时，所有守护线程强制终止。
 * 
 * @author Administrator
 *
 */
public class Demo19 {
	public static void main(String[] args) {
		Thread daemonThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println("守护线程...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		// 必须要在start之前去进行设置，否则会报错
		daemonThread.setDaemon(true);
		daemonThread.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("主线程结束了...");
	}
}
