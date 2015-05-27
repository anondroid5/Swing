package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest6 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * showConfirmDialog()メソッド
	   * 値:JOptionPane.YES_NO_OPTION YES/NO
	   * 値:JOptionPane.YES_NO_CANCEL_OPTION YES/NO/CANCEL
	   * 値:JOptionPane.OK_CANCEL_OPTION OK/CANCEL
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -6813726777508006486L;
	JLabel ansLabel;

	  public static void main(String[] args){
	    JOptionPaneTest6 frame = new JOptionPaneTest6();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest6(){
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
	    int option = JOptionPane.showConfirmDialog(this, "購入しますか？",
	      "選択ダイアログ", JOptionPane.YES_NO_OPTION);

	    if (option == JOptionPane.YES_OPTION){
	      ansLabel.setText("購入しました");
	    }else if (option == JOptionPane.NO_OPTION){
	      ansLabel.setText("購入されませんでした");
	    }
	  }
	}