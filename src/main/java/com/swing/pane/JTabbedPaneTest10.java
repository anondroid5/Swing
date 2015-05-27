package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest10 extends JFrame{

	  /**
	   * JTabbedPaneクラス
	   * setEnabledAt()メソッド
	   * タブを無効にする
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -7259438666363362434L;

	public static void main(String[] args){
	    JTabbedPaneTest10 frame = new JTabbedPaneTest10();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest10(){
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

	    tabbedpane.setEnabledAt(1, false);

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	  }
	}