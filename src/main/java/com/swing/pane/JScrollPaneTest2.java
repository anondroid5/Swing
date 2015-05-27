package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JScrollPaneTest2 extends JFrame{

	  /**
	   *  JScrollPane
	   *  スクロールペイン内のビューポートにコンポーネントを配置
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -5206861190815184268L;

	public static void main(String[] args){
	    JScrollPaneTest2 frame = new JScrollPaneTest2();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest2(){
	    JTextArea textarea = new JTextArea("JTextAreaを配置");

	    JScrollPane scrollpane = new JScrollPane();
	    scrollpane.setViewportView(textarea);

	    getContentPane().add(scrollpane, BorderLayout.CENTER);
	  }
	}