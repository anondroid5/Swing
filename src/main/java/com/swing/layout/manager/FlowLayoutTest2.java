package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class FlowLayoutTest2 extends JFrame{
	 /**
	 * FlowLayoutクラスのオブジェクトをメソッドで操作
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 7639629406385691482L;

	public static void main(String[] args){
		    FlowLayoutTest2 frame = new FlowLayoutTest2();

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(10, 10, 300, 200);
		    frame.setTitle("タイトル");
		    frame.setVisible(true);
		  }
	 
	 FlowLayoutTest2(){
		    JButton button1 = new JButton("Button1");
		    JButton button2 = new JButton("Button2");

		    JPanel p1 = new JPanel();
		    p1.setBackground(Color.ORANGE);
		    p1.add(button1);
		    p1.add(button2);

		    JButton button3 = new JButton("Button3");
		    JButton button4 = new JButton("Button4");

		    JPanel p2 = new JPanel();
		    p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		    p2.add(button3);
		    p2.add(button4);

		    JButton button5 = new JButton("Button5");
		    JButton button6 = new JButton("Button6");

		    JPanel p3 = new JPanel();
		    FlowLayout layout = new FlowLayout();
		    layout.setAlignment(FlowLayout.RIGHT);
		    p3.setLayout(layout);
		    p3.add(button5);
		    p3.add(button6);

		    getContentPane().add(p1, BorderLayout.CENTER);
		    getContentPane().add(p2, BorderLayout.PAGE_START);
		    getContentPane().add(p3, BorderLayout.PAGE_END);
		  }

}
