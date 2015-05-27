package com.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Container;
import java.awt.BorderLayout;

public class Sample003 extends JFrame{
	/**
	 * ラベルのフォントを設定する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String args[]){
	    Sample003 frame = new Sample003("タイトル");
	    frame.setVisible(true);
	  }
	Sample003(String title){
	    setTitle(title);
	    setBounds(100, 100, 300, 300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel p = new JPanel();

	    JLabel label1 = new JLabel("今日の日付：");
	    label1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 12));

	    JLabel label2 = new JLabel("21 Sep.2009");
	    label2.setFont(new Font("Century", Font.ITALIC, 20));

	    p.add(label1);
	    p.add(label2);

	    Container contentPane = getContentPane();
	    contentPane.add(p, BorderLayout.CENTER);
	  }

}
