package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest1 extends JFrame{
	
	/**
	 * JTabbedPaneクラス
	 * タブを追加していないのでタブは表示されない
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 2236227923508117520L;

	public static void main(String[] args){
	    JTabbedPaneTest1 frame = new JTabbedPaneTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest1(){
	    JTabbedPane tabbedpane = new JTabbedPane();

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	  }

}
