package com.swing.layout.manager;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GridLayoutTest1 extends JFrame{
	
	/**
	 * GridLayoutクラス
	 * 指定された数の行と列を持つグリッドレイアウトを作成する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 7967973272839403251L;

	public static void main(String[] args){
	    GridLayoutTest1 frame = new GridLayoutTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }
	
	GridLayoutTest1(){
	    JButton button1 = new JButton("Button1");
	    JButton button2 = new JButton("Button2");
	    JButton button3 = new JButton("Button3");

	    JPanel p = new JPanel();
	    p.setLayout(new GridLayout());

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
