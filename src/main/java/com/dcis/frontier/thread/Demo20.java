package com.dcis.frontier.thread;

import java.io.IOException;

/**
 * void interrupt() 把线程状态终止
 * 
 * @author Administrator
 *
 */
public class Demo20 {
	public static void main(String[] args) {
		Thread thread = new ThreadInterrupt();
		thread.start();
		System.out.println("请在3s内按下回车键来结束当前线程...");
		try {
			System.in.read();
			thread.interrupt();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ThreadInterrupt extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("sleep后面的代码");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
