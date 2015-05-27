package com.swing.event;

import javax.swing.*;
import java.awt.event.*;

public class Sample016 extends JFrame{

	/**
	 * getWindow()メソッド
	 * ウィンドウの発生元を返す
	 * ウィンドウイベント処理
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1414093717941275298L;

	public static void main(String[] args){
	    Sample016 test = new Sample016("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample016(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    addWindowListener(new myListener());
	  }
	
	public class myListener extends WindowAdapter{
	    public void windowClosing(WindowEvent e){
	      JFrame frame = (JFrame)e.getWindow();
	      System.out.println(frame.getTitle());
	    }
	  }
}
