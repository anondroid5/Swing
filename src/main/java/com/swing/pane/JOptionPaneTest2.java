package com.swing.pane;

import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest2 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * showMessageDialog()メソッド
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2918102415129062090L;

	public static void main(String[] args){
	    JOptionPaneTest2 frame = new JOptionPaneTest2();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest2(){
	    JButton button = new JButton("dialog");
	    button.addActionListener(this);

	    JPanel p = new JPanel();
	    p.add(button);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

	  public void actionPerformed(ActionEvent e){
	    JLabel label = new JLabel("Message");
	    label.setForeground(Color.RED);
	    JOptionPane.showMessageDialog(this, label);
	  }
	}