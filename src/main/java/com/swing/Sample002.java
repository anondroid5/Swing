package com.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;

public class Sample002 extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]){
		    Sample002 frame = new Sample002("タイトル");
		    frame.setVisible(true);
	 }
	 
	 Sample002(String title){
		    setTitle(title);
		    setBounds(100, 100, 300, 250);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    JPanel p = new JPanel();

		    JTextField text1 = new JTextField("東京都千代田区神田", 20);
		    text1.setHorizontalAlignment(JTextField.LEFT);

		    JTextField text2 = new JTextField("東京都千代田区神田", 20);
		    text2.setHorizontalAlignment(JTextField.CENTER);

		    JTextField text3 = new JTextField("東京都千代田区神田", 20);
		    text3.setHorizontalAlignment(JTextField.RIGHT);

		    p.add(text1);
		    p.add(text2);
		    p.add(text3);

		    Container contentPane = getContentPane();
		    contentPane.add(p, BorderLayout.CENTER);
		  }

}
