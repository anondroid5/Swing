package com.swing.event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class Sample006 extends JFrame implements ActionListener{
	/**
	 * イベント処理メソッドactionPerformedに
	 * 複数の処理を記述する方法(実践向け)
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	
	public static void main(String[] args){
		Sample006 test = new Sample006("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample006(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    label = new JLabel("");
	    label.setHorizontalAlignment(JLabel.CENTER);

	    JButton btn1 = new JButton("Button 1");
	    btn1.addActionListener(this);
	    btn1.setActionCommand("Button 1");

	    JButton btn2 = new JButton("Button 2");
	    btn2.addActionListener(this);
	    btn2.setActionCommand("Button 2");

	    JPanel p = new JPanel();
	    p.add(btn1);
	    p.add(btn2);

	    getContentPane().add(p, BorderLayout.CENTER);
	    getContentPane().add(label, BorderLayout.PAGE_END);
	  }
	
	public void actionPerformed(ActionEvent e){
		/* 処理したい内容をここに記述する */
		/* getActionCommand()で処理判定 */
	    String cmd = e.getActionCommand();
	    if (cmd.equals("Button 1")){
	      label.setText("ボタン1が押されました");
	    }else if (cmd.equals("Button 2")){
	      label.setText("ボタン2が押されました");
	    }
	  }

}
