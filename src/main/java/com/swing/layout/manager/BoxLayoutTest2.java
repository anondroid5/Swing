package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest2 extends JFrame{
	
	/**
	 * BoxLayout(Container target, int axis)
	 * BoxLayout.LINE_AXIS「左から右」
	 * BoxLayout.PAGE_AXIS「上から下」
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -7007111738716062266L;

	public static void main(String[] args){
	    BoxLayoutTest2 frame = new BoxLayoutTest2();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  BoxLayoutTest2(){
	    JButton button1 = new JButton("Google");
	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));
	    JButton button3 = new JButton("MSN");

	    JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
