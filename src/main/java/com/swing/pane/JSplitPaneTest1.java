package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest1 extends JFrame{

	  /**
	   * JSplitPaneクラス
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -1002313160203150287L;

	public static void main(String[] args){
	    JSplitPaneTest1 frame = new JSplitPaneTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest1(){
	    JSplitPane splitpane = new JSplitPane();

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	  }
	}