package com.swing.event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Sample014 extends JFrame implements ActionListener,WindowListener{

	/**
	 * WindowListenerインターフェース
	 * 実装に必要なメソッドは7つある
	 * ウィンドウイベント処理
	 * サンプルプログラム(実践向けではない)
	 */
	private static final long serialVersionUID = 5097487801986786337L;
	JTextArea textArea;
	JFrame frame;
	String newline = System.getProperty("line.separator");
	
	public static void main(String[] args){
	    Sample014 test = new Sample014("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample014(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    textArea = new JTextArea("");

	    JScrollPane sp = new JScrollPane();
	    sp.getViewport().setView(textArea);
	    sp.setPreferredSize(new Dimension(200, 80));

	    JButton btn = new JButton("Window Create");
	    btn.addActionListener(this);

	    getContentPane().add(sp, BorderLayout.CENTER);
	    getContentPane().add(btn, BorderLayout.PAGE_END);
	  }
	
	public void actionPerformed(ActionEvent e){
	    frame = new JFrame("TestWindow");
	    frame.setBounds( 100, 30, 100, 100);
	    frame.setVisible(false);
	    frame.addWindowListener(this);
	    frame.setVisible(true);
	  }
	
	public void windowClosing(WindowEvent e) {
		/*ユーザが、ウィンドウのシステムメニューでウィンドウを閉じようとしたときに呼び出される*/
	    textArea.append("Window closing" + newline);
	  }
	
	public void windowClosed(WindowEvent e) {
		/*ウィンドウに対する dispose の呼び出しの結果として、ウィンドウがクローズされたときに呼び出される*/
	    textArea.append("Window closed" + newline);
	    System.out.println("33");
	  }

	  public void windowOpened(WindowEvent e) {
		/*ウィンドウが最初に可視になったときに呼び出される*/
	    textArea.append("Window opened" + newline);
	  }

	  public void windowIconified(WindowEvent e) {
		/*ウィンドウが通常の状態から最小化された状態に変更されたときに呼び出される*/
	    textArea.append("Window iconified" + newline);
	  }

	  public void windowDeiconified(WindowEvent e) {
		/*ウィンドウが最小化された状態から通常の状態に変更されたときに呼び出される。*/
	    textArea.append("Window deiconified" + newline);
	  }

	  public void windowActivated(WindowEvent e) {
		/*Window がアクティブ Window に設定されると呼び出される*/
	    textArea.append("Window activated" + newline);
	  }

	  public void windowDeactivated(WindowEvent e) {
		/*Window がアクティブ Window でなくなったときに呼び出される*/
	    textArea.append("Window deactivated" + newline);
	  }
}
