package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest8 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * showConfirmDialog()メソッド
	   * アイコンを指定して選択ダイアログを表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -5207086778258524607L;
	JLabel ansLabel;

	  public static void main(String[] args){
	    JOptionPaneTest8 frame = new JOptionPaneTest8();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest8(){
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
	    ImageIcon icon = new ImageIcon("./gif/new1.gif");

	    int option = JOptionPane.showConfirmDialog(this, "実行しますか？",
	      "最終確認", JOptionPane.YES_NO_OPTION, 
	      JOptionPane.WARNING_MESSAGE, icon);

	    if (option == JOptionPane.YES_OPTION){
	      ansLabel.setText("実行しました");
	    }else if (option == JOptionPane.NO_OPTION){
	      ansLabel.setText("実行は中止しました");
	    }
	  }
	}