package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest9 extends JFrame{

	  /**
	   * JTabbedPaneクラス
	   * setTabLayoutPolicy()メソッドでタブの数が多い際の設定
	   * タブの数が非常に多い場合の表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -6235218242574420756L;

	public static void main(String[] args){
	    JTabbedPaneTest9 frame = new JTabbedPaneTest9();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest9(){
	    JTabbedPane tabbedpane = new JTabbedPane();

	    for (int i = 0 ; i < 10 ; i++){
	      tabbedpane.addTab("tab" + i, new JButton("button"));
	    }

	    //tabbedpane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
	    tabbedpane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	  }
	}