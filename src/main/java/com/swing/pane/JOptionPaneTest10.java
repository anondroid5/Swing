package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest10 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * showInputDialog()
	   * 初期値を設定した入力ダイアログの表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 8808246504174981671L;
	JLabel ansLabel;

	  public static void main(String[] args){
	    JOptionPaneTest10 frame = new JOptionPaneTest10();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest10(){
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
	      "名前を入力して下さい");

	    if (value == null){
	      ansLabel.setText("取消されました");
	    }else{
	      ansLabel.setText(value);
	    }
	  }
}