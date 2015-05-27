package com.swing.layout.manager;

import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutTest3 extends JFrame{
	/**
	 * BorderLayoutクラスのオブジェクトを
	 * メソッドsetHgap,setVgapで調整する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2126380109735358987L;

	public static void main(String[] args){
	    BorderLayoutTest3 frame = new BorderLayoutTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }
	
	BorderLayoutTest3(){
	    JButton button1 = new JButton("CENTER");
	    JButton button2 = new JButton("PAGE_START");
	    JButton button3 = new JButton("PAGE_END");
	    JButton button4 = new JButton("LINE_START");
	    JButton button5 = new JButton("LINE_END");

	    //このような使用方法もできる
	    //BorderLayout layout = new BorderLayout(10, 5);
	    BorderLayout layout = new BorderLayout();
	    layout.setVgap(2);
	    layout.setHgap(10);
	    setLayout(layout);

	    getContentPane().add(button1, BorderLayout.CENTER);
	    getContentPane().add(button2, BorderLayout.PAGE_START);
	    getContentPane().add(button3, BorderLayout.PAGE_END);
	    getContentPane().add(button4, BorderLayout.LINE_START);
	    getContentPane().add(button5, BorderLayout.LINE_END);
	  }

}
