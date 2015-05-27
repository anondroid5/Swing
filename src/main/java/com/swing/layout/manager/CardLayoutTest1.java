package com.swing.layout.manager;

import javax.swing.*;
import java.awt.CardLayout;
import java.awt.BorderLayout;

public class CardLayoutTest1 extends JFrame{
	
	/**
	 * CardLayoutクラスによる配置
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 2646927007727699083L;

	public static void main(String[] args){
	    CardLayoutTest1 frame = new CardLayoutTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  CardLayoutTest1(){
	    JButton button = new JButton("Button");
	    JLabel label = new JLabel("Label");
	    JTextField text = new JTextField("", 10);

	    JPanel p = new JPanel();
	    p.setLayout(new CardLayout());

	    p.add(button, "button");
	    p.add(label, "label");
	    p.add(text, "text");

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
