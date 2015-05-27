package com.swing.layout.manager;

import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutTest2 extends JFrame{
	
	/**
	 * BorderLayoutクラスのインスタンスをパネルに設定
	 * 絶対指定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 2260252535455076224L;

	public static void main(String[] args){
	    BorderLayoutTest2 frame = new BorderLayoutTest2();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }
	
	BorderLayoutTest2(){
	    JButton button1 = new JButton("NORTH");
	    JButton button2 = new JButton("CENTER");
	    JButton button3 = new JButton("SOUTH");
	    JButton button4 = new JButton("WEST");
	    JButton button5 = new JButton("EAST");

	    JPanel p = new JPanel();
	    p.setLayout(new BorderLayout());

	    p.add(button1, BorderLayout.NORTH);
	    p.add(button2, BorderLayout.CENTER);
	    p.add(button3, BorderLayout.SOUTH);
	    p.add(button4, BorderLayout.WEST);
	    p.add(button5, BorderLayout.EAST);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
