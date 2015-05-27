package com.swing.event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class Sample007 extends JFrame implements ActionListener{
	/**
	 * actionPerformed()メソッドでイベント処理
	 * getModifiers()メソッドで押されたボタンの判別
	 * (ALT,CTRL,META,SHIFT)
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	
	public static void main(String[] args){
		Sample007 test = new Sample007("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample007(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    label = new JLabel("");
	    label.setHorizontalAlignment(JLabel.CENTER);

	    JButton btn = new JButton("Push!");
	    btn.addActionListener(this);

	    JPanel p = new JPanel();
	    p.add(btn);

	    getContentPane().add(p, BorderLayout.CENTER);
	    getContentPane().add(label, BorderLayout.PAGE_END);
	  }
	
	 public void actionPerformed(ActionEvent e){
		 /* 処理したい内容をここに記述する */
		    int modifiers = e.getModifiers();

		    StringBuffer sb = new StringBuffer();
		    sb.append("ボタンクリック ");
		    if ((modifiers & ActionEvent.ALT_MASK) == ActionEvent.ALT_MASK){
		      sb.append("ALT ");
		    }
		    if ((modifiers & ActionEvent.CTRL_MASK) == ActionEvent.CTRL_MASK){
		      sb.append("CTRL ");
		    }
		    if ((modifiers & ActionEvent.META_MASK) == ActionEvent.META_MASK){
		      sb.append("META ");
		    }
		    if ((modifiers & ActionEvent.SHIFT_MASK) == ActionEvent.SHIFT_MASK){
		      sb.append("SHIFT");
		    }
		    label.setText(new String(sb));
		  }

}
