package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest2 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * JSplitPane.HORIZONTAL_SPLIT-左右に分割
	   * JSplitPane.VERTICAL_SPLIT-上下に分割
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -7607461020696802255L;

	public static void main(String[] args){
	    JSplitPaneTest2 frame = new JSplitPaneTest2();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest2(){
	    JSplitPane splitpane = new JSplitPane();
	    splitpane.setOrientation(JSplitPane.VERTICAL_SPLIT);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	  }
	}