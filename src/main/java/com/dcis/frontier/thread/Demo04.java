package com.dcis.frontier.thread;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * swing
 * 
 * @author Administrator
 *
 */
public class Demo04 {
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
		panel.setBackground(Color.RED);
		frame.add(panel);

		// 设置关闭时的行为--结束程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
