package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest7 extends JFrame{
	
	/**
	 * BoxLayoutを設定
	 * Box.createRigidArea(new Dimension(10,1)-10×1ピクセルの透明なコンポーネントを追加
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -1288194898679382844L;

	public static void main(String[] args){
	    BoxLayoutTest7 frame = new BoxLayoutTest7();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  BoxLayoutTest7(){
	    JButton button1 = new JButton("Google");
	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));
	    JButton button3 = new JButton("MSN");

	    JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));

	    p.add(button1);
	    p.add(Box.createRigidArea(new Dimension(10,1)));
	    p.add(button2);
	    p.add(Box.createRigidArea(new Dimension(5,1)));
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
