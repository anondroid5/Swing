package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JTabbedPaneTest15 extends JFrame{

	  /**
	   * JTabbedPane
	   * タブペインのサイズを設定
	   * setPreferredSize()メソッド
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -8638389779154819807L;

	public static void main(String[] args){
	    JTabbedPaneTest15 frame = new JTabbedPaneTest15();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest15(){
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

	    tabbedpane.setPreferredSize(new Dimension(200, 150));

	    JPanel p = new JPanel();
	    p.add(tabbedpane);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }
	}