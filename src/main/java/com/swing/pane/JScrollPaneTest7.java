package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JScrollPaneTest7 extends JFrame{
	
	/**
	 * JScrollPane
	 * 新しいビューポートを作成する事も出来る
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -6077223653422279931L;

	public static void main(String[] args){
	    JScrollPaneTest7 frame = new JScrollPaneTest7();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest7(){
	    JScrollPane scrollpane = new JScrollPane();
	    scrollpane.setPreferredSize(new Dimension(200, 120));

	    JViewport view = scrollpane.getViewport();

	    JTextArea textarea = new JTextArea("JTextAreaを配置");
	    view.setView(textarea);

	    JPanel panel = new JPanel();
	    panel.add(scrollpane);

	    getContentPane().add(panel, BorderLayout.CENTER);
	  }

}
