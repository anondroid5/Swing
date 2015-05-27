package com.swing.layout.manager;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GridLayoutTest2 extends JFrame{
	
	/**
	 * GridLayoutクラス
	 * rows - 行数
	 * cols - 列数
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 144069168215450177L;

	public static void main(String[] args){
	    GridLayoutTest2 frame = new GridLayoutTest2();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  GridLayoutTest2(){
	    JButton button1 = new JButton("Button1");
	    JButton button2 = new JButton("Button2");
	    JButton button3 = new JButton("Button3");
	    JLabel label1 = new JLabel("Label1");
	    JLabel label2 = new JLabel("Label2");

	    JPanel p = new JPanel();
	    //GridLayout layout = new GridLayout();
	    //layout.setRows(3);
	    //layout.setColumns(2);
	    p.setLayout(new GridLayout(3, 2));

	    p.add(button1);
	    p.add(label1);
	    p.add(label2);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
