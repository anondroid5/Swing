package com.swing.layout.manager;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class FlowLayoutTest1 extends JFrame{
	/**
	 * FlowLayoutクラス
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2690255333183613993L;

	public static void main(String[] args){
	    FlowLayoutTest1 frame = new FlowLayoutTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  FlowLayoutTest1(){
	    JButton button1 = new JButton("Button");
	    JButton button2 = new JButton("Long Button");
	    JButton button3 = new JButton("Bic Size Button");
	    button3.setPreferredSize(new Dimension(150, 100));
	    JButton button4 = new JButton("a");
	    JButton button5 = new JButton("b");

	    JPanel p = new JPanel();
	    p.setLayout(new FlowLayout());

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);
	    p.add(button4);
	    p.add(button5);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
