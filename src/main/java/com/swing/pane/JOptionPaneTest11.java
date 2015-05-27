package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest11 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * showInputDialog()メソッド
	   * タイトルとメッセージタイプを指定して入力ダイアログを表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 4628482647203213711L;
	JLabel ansLabel;

	  public static void main(String[] args){
	    JOptionPaneTest11 frame = new JOptionPaneTest11();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest11(){
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
	    String value = JOptionPane.showInputDialog(this, "お名前は？", 
	      "名前の入力", JOptionPane.INFORMATION_MESSAGE);

	    if (value == null){
	      ansLabel.setText("取消されました");
	    }else{
	      ansLabel.setText(value);
	    }
	  }
	}