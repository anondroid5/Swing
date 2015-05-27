package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JScrollPaneTest6 extends JFrame{
	
	 /**
	  * JScrollPane
	  * スクロールペインにコンテンツを配置
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 6682954105371179992L;

	public static void main(String[] args){
		    JScrollPaneTest6 frame = new JScrollPaneTest6();

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(10, 10, 300, 200);
		    frame.setTitle("タイトル");
		    frame.setVisible(true);
		  }

		  JScrollPaneTest6(){
		    JScrollPane scrollpane = new JScrollPane();
		    scrollpane.setPreferredSize(new Dimension(200, 120));

		    JViewport view = new JViewport();

		    JTextArea textarea = new JTextArea("JTextAreaを配置");
		    view.setView(textarea);

		    scrollpane.setViewport(view);

		    JPanel panel = new JPanel();
		    panel.add(scrollpane);

		    getContentPane().add(panel, BorderLayout.CENTER);
		  }

}
