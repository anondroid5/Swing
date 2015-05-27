package com.swing.event;

import javax.swing.*;
import java.awt.event.*;

public class Sample005 extends JFrame implements ActionListener{
	 /**
	 * actionPerformedメソッドを使用してイベント処理する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	 
	 public static void main(String[] args){
		 Sample005 test = new Sample005("SwingTest");

		 test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 test.setVisible(true);
	 }
	 
	 Sample005(String title){
		    setTitle(title);
		    setBounds( 10, 10, 300, 200);

		    label = new JLabel("");

		    JButton btn = new JButton("Push");
		    btn.addActionListener(this);

		    JPanel p = new JPanel();
		    p.add(label);
		    p.add(btn);

		    getContentPane().add(p);
		  }
	 
	 public void actionPerformed(ActionEvent e){
		 /* 処理したい内容をここに記述する */
		    label.setText("Push");
	}

}
