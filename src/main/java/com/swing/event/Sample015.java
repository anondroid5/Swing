package com.swing.event;

import javax.swing.*;
import java.awt.event.*;

public class Sample015 extends JFrame{

	/**
	 * 要なメソッドだけ自分で再度定義できるWindowAdapterクラス
	 * ウィンドウイベント処理
	 * サンプルプログラム(実践向け)
	 */
	private static final long serialVersionUID = -4026452561282162150L;

	public static void main(String[] args){
		Sample015 test = new Sample015("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample015(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    addWindowListener(new myListener());
	  }
	
	public class myListener extends WindowAdapter{
		/* 必要なメソッドだけ自分で再度定義 */
	    public void windowClosing(WindowEvent e) {
	      System.out.println("Window closing");
	    }
	}
	
}
