package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest1 extends JFrame{
	
	/**
	 * BoxLayout(Container target, int axis)
	 * 1番目の引数はコンテナオブジェクト
	 * 2番目はどの方向に配置するか
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2678251843036487523L;

	public static void main(String[] args){
	    BoxLayoutTest1 frame = new BoxLayoutTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  BoxLayoutTest1(){
	    JButton button1 = new JButton("Google");
	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));
	    JButton button3 = new JButton("MSN");

	    JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
