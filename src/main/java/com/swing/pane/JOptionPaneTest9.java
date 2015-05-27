package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest9 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * 入力ダイアログの表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -596438022216958067L;
	JLabel ansLabel;

	  public static void main(String[] args){
	    JOptionPaneTest9 frame = new JOptionPaneTest9();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest9(){
	    JButton infoButton = new JButton("Question");
	    infoButton.addActionListener(this);

	    JPanel p = new JPanel();
	    p.add(infoButton);

	    ansLabel = new JLabel("未入力です");
	    JPanel ansPanel = new JPanel();
	    ansPanel.add(ansLabel);

	    getContentPane().add(p, BorderLayout.CENTER);
	    getContentPane().add(ansPanel, BorderLayout.PAGE_END);
	  }

	  public void actionPerformed(ActionEvent e){
	    String value = JOptionPane.showInputDialog(this, "お名前は？");

	    if (value == null){
	      ansLabel.setText("取消されました");
	    }else{
	      ansLabel.setText(value);
	    }
	  }
	}