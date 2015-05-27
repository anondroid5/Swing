package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.border.*;

public class JScrollPaneTest5 extends JFrame{
	
	/**
	 * JScrollPane
	 * 枠線の設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 3043539571418619297L;

	public static void main(String[] args){
	    JScrollPaneTest5 frame = new JScrollPaneTest5();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest5(){
	    JTextArea textarea = new JTextArea("JTextAreaを配置");

	    JScrollPane scrollpane = new JScrollPane(textarea);
	    scrollpane.setPreferredSize(new Dimension(200, 120));

	    Border border = new BevelBorder(BevelBorder.RAISED);
	    scrollpane.setBorder(border);

	    JPanel panel = new JPanel();
	    panel.add(scrollpane);

	    getContentPane().add(panel, BorderLayout.CENTER);
	  }
}