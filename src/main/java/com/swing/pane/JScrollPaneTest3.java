package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JScrollPaneTest3 extends JFrame{
	
	/**
	 * JScrollPane
	 * スクロールバーの表示条件の設定
	 *  ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED 
	 *  ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER 
	 *  ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
	 *  上記の３値のいずれかを設定する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -8095544336568606512L;

	public static void main(String[] args){
	    JScrollPaneTest3 frame = new JScrollPaneTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest3(){
	    JTextArea textarea = new JTextArea("JTextAreaを配置");

	    JScrollPane scrollpane = new JScrollPane(textarea);
	    scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	    getContentPane().add(scrollpane, BorderLayout.CENTER);
	  }

}
