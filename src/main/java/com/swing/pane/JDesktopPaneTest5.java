package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest5 extends JFrame{

	  /**
	   * JDesktopPaneクラス
	   * インターナルフレームのタイトルを設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 4541450021955894707L;

	public static void main(String[] args){
	    JDesktopPaneTest5 frame = new JDesktopPaneTest5();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JDesktopPaneTest5(){
	    JDesktopPane desktop = new JDesktopPane();

	    JInternalFrame iframe1 = new JInternalFrame("IFrame1");
	    iframe1.setSize(250, 120);
	    iframe1.setLocation(10, 10);
	    iframe1.setVisible(true);

	    JInternalFrame iframe2 = new JInternalFrame();
	    iframe2.setSize(250, 120);
	    iframe2.setLocation(30, 30);
	    iframe2.setTitle("IFrame2");
	    iframe2.setVisible(true);

	    desktop.add(iframe1);
	    desktop.add(iframe2);

	    getContentPane().add(desktop, BorderLayout.CENTER);
	  }
	}