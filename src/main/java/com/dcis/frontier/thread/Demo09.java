package com.dcis.frontier.thread;

/**
 * 有一个线程对象，用来处理用户的买票操作 有三个用户来不停买票，假定有100张票，售完为止
 * 
 * @author Administrator
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		TicketThread ticketThread = new TicketThread();

		// 第二个参数就是自己定义的线程名，用来覆盖默认给定的线程名
		Thread t1 = new Thread(ticketThread, "Tom");
		Thread t2 = new Thread(ticketThread, "Jack");
		Thread t3 = new Thread(ticketThread, "Tony");
		t1.start();
		t2.start();
		t3.start();
	}
}

class TicketThread implements Runnable {
	/** 总票数 **/
	private int count = 100;

	@Override
	public void run() {
		while (true) {
			// 如果count>0说明，有票可以出售
			if (count > 0) {
				System.out.println(Thread.currentThread().getName() + "买了一张票，正在销售的是第" + (count--) + "张票");
			}
			// 当count<=0说明没票，停止出售
			else {
				System.out.println("票卖完了...");
				break;
			}
		}

	}
}
