package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest2 extends JFrame{

	  /**
	   * JDesktopPaneクラス
	   * JInternalFrameクラスの定義
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -7544785970010170984L;

	public static void main(String[] args){
	    JDesktopPaneTest2 frame = new JDesktopPaneTest2();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JDesktopPaneTest2(){
	    JDesktopPane desktop = new JDesktopPane();

	    JInternalFrame iframe = new JInternalFrame();
	    iframe.setSize(150, 100);
	    iframe.setLocation(10, 10);
	    iframe.setVisible(true);
	    desktop.add(iframe);

	    getContentPane().add(desktop, BorderLayout.CENTER);
	  }
	}