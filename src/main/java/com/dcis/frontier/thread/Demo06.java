package com.dcis.frontier.thread;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo06 {
	public static void main(String[] args) {
		// 框架
		JFrame frame = new JFrame("窗体文字");
		// 设置框架的大小
		frame.setSize(300, 300);
		// 设置框架可可见
		frame.setVisible(true);
		// 要嵌入框架的面板
		JPanel panel = new JPanel();
		panel.setSize(300, 300);
		panel.setBackground(Color.BLACK);
		frame.add(panel);
		// 设置关闭时的行为--结束程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Thread t1 = new Thread(new ChangeColorThread02(panel));
		t1.start();
	}
}

class ChangeColorThread02 implements Runnable {
	private int type = 0;
	private JPanel panel;

	public ChangeColorThread02(JPanel panel) {
		this.panel = panel;
	}

	@Override
	public void run() {
		while (true) {
			if (type == 0) {
				panel.setBackground(Color.RED);
				type = 1;
			} else {
				panel.setBackground(Color.BLACK);
				type = 0;
			}
		}
	}
}