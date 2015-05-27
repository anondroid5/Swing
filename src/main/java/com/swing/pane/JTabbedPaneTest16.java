package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

public class JTabbedPaneTest16 extends JFrame{

	  /**
	   * JTabbedPaneクラス
	   * キーボードニーモニック
	   * Alt+A~Z or Alt+0~9
	   * setMnemonicAt()メソッド
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -1711661347759833328L;

	public static void main(String[] args){
	    JTabbedPaneTest16 frame = new JTabbedPaneTest16();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest16(){
	    JTabbedPane tabbedpane = new JTabbedPane();

	    JPanel tabPanel1 = new JPanel();
	    tabPanel1.add(new JButton("button1"));

	    JPanel tabPanel2 = new JPanel();
	    tabPanel2.add(new JLabel("Name:"));
	    tabPanel2.add(new JTextField("", 10));

	    JPanel tabPanel3 = new JPanel();
	    tabPanel3.add(new JButton("button2"));

	    tabbedpane.addTab("Button", tabPanel1);
	    tabbedpane.addTab("Text", tabPanel2);
	    tabbedpane.addTab("Other", tabPanel3);

	    tabbedpane.setMnemonicAt(0, KeyEvent.VK_B);
	    tabbedpane.setMnemonicAt(1, KeyEvent.VK_T);
	    tabbedpane.setMnemonicAt(2, KeyEvent.VK_O);

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	  }
	}