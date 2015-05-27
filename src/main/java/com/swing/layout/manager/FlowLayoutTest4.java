package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;


public class FlowLayoutTest4 extends JFrame{
	/**
	 * FlowLayoutクラスのsetAlignOnBaselineメソッドを使用して
	 * ベースラインに揃えて配置する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 263803910658730748L;

	public static void main(String[] args){
	    FlowLayoutTest4 frame = new FlowLayoutTest4();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }
	
	FlowLayoutTest4(){
	    JLabel label1 = new JLabel("ABC");
	    label1.setFont(new Font(Font.DIALOG, Font.PLAIN, 32));
	    label1.setOpaque(true);
	    label1.setBackground(Color.WHITE);

	    JLabel label2 = new JLabel("ABC");
	    label2.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
	    label2.setOpaque(true);
	    label2.setBackground(Color.WHITE);

	    JLabel label3 = new JLabel("ABC");
	    label3.setFont(new Font(Font.DIALOG, Font.PLAIN, 16));
	    label3.setOpaque(true);
	    label3.setBackground(Color.WHITE);

	    JPanel p = new JPanel();

	    FlowLayout layout = new FlowLayout();
	    layout.setAlignOnBaseline(true);
	    p.setLayout(layout);

	    p.add(label1);
	    p.add(label2);
	    p.add(label3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
