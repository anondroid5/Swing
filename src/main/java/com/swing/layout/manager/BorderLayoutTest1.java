package com.swing.layout.manager;

import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutTest1 extends JFrame{

	/**
	 * BorderLayoutクラスのインスタンスをパネルに設定
	 * 相対指定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 6436795552096388987L;

	public static void main(String[] args){
	    BorderLayoutTest1 frame = new BorderLayoutTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }
	
	BorderLayoutTest1(){
	    JButton button1 = new JButton("PAGE_START");
	    JButton button2 = new JButton("CENTER");
	    JButton button3 = new JButton("PAGE_END");
	    JButton button4 = new JButton("LINE_START");
	    JButton button5 = new JButton("LINE_END");

	    //ここが重要
	    JPanel p = new JPanel();
	    p.setLayout(new BorderLayout());

	    p.add(button1, BorderLayout.PAGE_START);
	    p.add(button2, BorderLayout.CENTER);
	    p.add(button3, BorderLayout.PAGE_END);
	    p.add(button4, BorderLayout.LINE_START);
	    p.add(button5, BorderLayout.LINE_END);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }
}
