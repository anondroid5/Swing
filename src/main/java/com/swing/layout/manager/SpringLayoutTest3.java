package com.swing.layout.manager;


import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class SpringLayoutTest3 extends JFrame{
	
	/**
	 * SpringLayout
	 * 制約を使ってサイズの指定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2919687611156169050L;

	public static void main(String[] args){
	    SpringLayoutTest3 frame = new SpringLayoutTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  SpringLayoutTest3(){
	    SpringLayout layout = new SpringLayout();
	    JPanel p = new JPanel();
	    p.setLayout(layout);

	    JButton button1 = new JButton("Google");
	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));

	    layout.putConstraint(SpringLayout.NORTH, button1, 50, SpringLayout.NORTH, p);
	    layout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, p);
	    layout.putConstraint(SpringLayout.EAST, button1, -10, SpringLayout.EAST, p);

	    layout.putConstraint(SpringLayout.NORTH, button2, 100, SpringLayout.NORTH, p);
	    layout.putConstraint(SpringLayout.WEST, button2, 10, SpringLayout.WEST, p);
	    layout.putConstraint(SpringLayout.EAST, button2, -10, SpringLayout.EAST, p);

	    p.add(button1);
	    p.add(button2);

	    getContentPane().add(p, BorderLayout.CENTER);
	    
	  }

}
