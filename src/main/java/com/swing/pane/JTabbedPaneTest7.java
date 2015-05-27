package com.swing.pane;

import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;

public class JTabbedPaneTest7 extends JFrame{
	
	 /**
	  * JTabbedPaneクラス
	  * setBackgroundAt()
	  * 背景色指定
	  * Colorクラス
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 6617949081119636997L;

	public static void main(String[] args){
		    JTabbedPaneTest7 frame = new JTabbedPaneTest7();

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(10, 10, 300, 200);
		    frame.setTitle("タイトル");
		    frame.setVisible(true);
		  }

		  JTabbedPaneTest7(){
		    JTabbedPane tabbedpane = new JTabbedPane();

		    JPanel tabPanel1 = new JPanel();
		    tabPanel1.add(new JButton("button1"));

		    JPanel tabPanel2 = new JPanel();
		    tabPanel2.add(new JLabel("Name:"));
		    tabPanel2.add(new JTextField("", 10));

		    JPanel tabPanel3 = new JPanel();
		    tabPanel3.add(new JButton("button2"));

		    tabbedpane.addTab("tab1", tabPanel1);
		    tabbedpane.addTab("tab2", tabPanel2);
		    tabbedpane.addTab("tab3", tabPanel3);

		    tabbedpane.setBackgroundAt(0, Color.WHITE);
		    tabbedpane.setForegroundAt(1, Color.WHITE);
		    tabbedpane.setBackgroundAt(1, Color.BLACK);
		    tabbedpane.setBackgroundAt(2, Color.GREEN);

		    getContentPane().add(tabbedpane, BorderLayout.CENTER);
		  }

}
