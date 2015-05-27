package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest1 extends JFrame{

	  /**
	   * JDesktopPaneクラス
	   * JDesktopPaneクラスの定義
	   * 表示は真っ白
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -1830472295712536125L;

	public static void main(String[] args){
	    JDesktopPaneTest1 frame = new JDesktopPaneTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JDesktopPaneTest1(){
	    JDesktopPane desktop = new JDesktopPane();

	    getContentPane().add(desktop, BorderLayout.CENTER);
	  }
	}