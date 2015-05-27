package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JScrollPaneTest4 extends JFrame{
	
	/**
	 * JScrollPane
	 * スクロールペインのサイズを指定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -3651878780387352999L;

	public static void main(String[] args){
	    JScrollPaneTest4 frame = new JScrollPaneTest4();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest4(){
	    JTextArea textarea = new JTextArea("JTextAreaを配置");

	    JScrollPane scrollpane = new JScrollPane(textarea);
	    scrollpane.setPreferredSize(new Dimension(200, 120));

	    JPanel panel = new JPanel();
	    panel.add(scrollpane);

	    getContentPane().add(panel, BorderLayout.CENTER);
	  }

}
