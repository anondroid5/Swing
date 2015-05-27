package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest5 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * 選択ダイアログの表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 2609361287388708089L;
	JLabel ansLabel;

	  public static void main(String[] args){
	    JOptionPaneTest5 frame = new JOptionPaneTest5();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest5(){
	    JButton infoButton = new JButton("Question");
	    infoButton.addActionListener(this);

	    JPanel p = new JPanel();
	    p.add(infoButton);

	    ansLabel = new JLabel("未選択です");
	    JPanel ansPanel = new JPanel();
	    ansPanel.add(ansLabel);

	    getContentPane().add(p, BorderLayout.CENTER);
	    getContentPane().add(ansPanel, BorderLayout.PAGE_END);
	  }

	  public void actionPerformed(ActionEvent e){
	    int option = JOptionPane.showConfirmDialog(this, "男性ですか？");

	    if (option == JOptionPane.YES_OPTION){
	      ansLabel.setText("男性です");
	    }else if (option == JOptionPane.NO_OPTION){
	      ansLabel.setText("女性です");
	    }else if (option == JOptionPane.CANCEL_OPTION){
	      ansLabel.setText("キャンセルされました");
	    }
	  }
	}