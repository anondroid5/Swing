package com.swing.event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.util.Date;

public class Sample008 extends JFrame implements ActionListener{
	/**
	 * actionPerformed()メソッドを使用したイベント処理
	 * getWhen()メソッドを使用してクリックした時刻を表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	
	public static void main(String[] args){
	    Sample008 test = new Sample008("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample008(String title){
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
	    long time = e.getWhen();

	    DateFormat df = 
	      DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
	    String clickTime = df.format(new Date(time));

	    label.setText(clickTime);
	  }
	
	
}
