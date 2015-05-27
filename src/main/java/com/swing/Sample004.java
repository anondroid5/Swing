package com.swing;

import javax.swing.*;
import java.awt.BorderLayout;

public class Sample004 extends JFrame{
	/**
	 * スクロールバーとテキストエリアのサンプル
	 * テキストエリアにスクロールバーを設置する
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		Sample004 frame = new Sample004();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }
	
	Sample004(){
	    JTextArea textarea = new JTextArea("JTextAreaを配置");

	    JScrollPane scrollpane = new JScrollPane(textarea);
	    scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	    getContentPane().add(scrollpane, BorderLayout.CENTER);
	  }

}
