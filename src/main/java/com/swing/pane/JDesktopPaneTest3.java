package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest3 extends JFrame{

	  /**
	   * JDesktopPaneクラス
	   * デスクトップペインにインターナルフレームを追加
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -7758759362762343967L;

	public static void main(String[] args){
	    JDesktopPaneTest3 frame = new JDesktopPaneTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JDesktopPaneTest3(){
	    JDesktopPane desktop = new JDesktopPane();

	    JInternalFrame iframe1 = new JInternalFrame();
	    iframe1.setSize(150, 100);
	    iframe1.setLocation(10, 10);
	    iframe1.setVisible(true);

	    JInternalFrame iframe2 = new JInternalFrame();
	    iframe2.setSize(150, 100);
	    iframe2.setLocation(30, 30);
	    iframe2.setVisible(true);

	    desktop.add(iframe1);
	    desktop.add(iframe2);

	    getContentPane().add(desktop, BorderLayout.CENTER);
	  }
	}