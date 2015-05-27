package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest3 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * showMessageDialog()メソッド
	   * JOptionPane.ERROR_MESSAGE-エラーメッセージ
	   * JOptionPane.INFORMATION_MESSAGE-情報メッセージ
	   * JOptionPane.WARNING_MESSAGE-警告メッセージ
	   * JOptionPane.QUESTION_MESSAGE-質問メッセージ
	   * JOptionPane.PLAIN_MESSAGE-アイコン非表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -8589680072528778991L;

	public static void main(String[] args){
	    JOptionPaneTest3 frame = new JOptionPaneTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest3(){
	    JButton errButton = new JButton("Error");
	    errButton.addActionListener(this);
	    errButton.setActionCommand("Error");

	    JButton infoButton = new JButton("Info");
	    infoButton.addActionListener(this);
	    infoButton.setActionCommand("Info");

	    JButton warnButton = new JButton("Warn");
	    warnButton.addActionListener(this);
	    warnButton.setActionCommand("Warn");

	    JButton quesButton = new JButton("Ques");
	    quesButton.addActionListener(this);
	    quesButton.setActionCommand("Ques");

	    JButton plainButton = new JButton("Plain");
	    plainButton.addActionListener(this);
	    plainButton.setActionCommand("Plain");

	    JPanel p = new JPanel();
	    p.add(errButton);
	    p.add(infoButton);
	    p.add(warnButton);
	    p.add(quesButton);
	    p.add(plainButton);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

	  public void actionPerformed(ActionEvent e){
	    String cmd = e.getActionCommand();

	    if (cmd.equals("Error")){
	      JOptionPane.showMessageDialog(this, "ERROR_MESSAGE", "Error",
	        JOptionPane.ERROR_MESSAGE);
	    }else if (cmd.equals("Info")){
	      JOptionPane.showMessageDialog(this, "INFORMATION_MESSAGE", "Info",
	        JOptionPane.INFORMATION_MESSAGE);
	    }else if (cmd.equals("Warn")){
	      JOptionPane.showMessageDialog(this, "WARNING_MESSAGE", "Warn",
	        JOptionPane.WARNING_MESSAGE);
	    }else if (cmd.equals("Ques")){
	      JOptionPane.showMessageDialog(this, "QUESTION_MESSAGE", "Ques",
	        JOptionPane.QUESTION_MESSAGE);
	    }else if (cmd.equals("Plain")){
	      JOptionPane.showMessageDialog(this, "PLAIN_MESSAGE", "Plain",
	        JOptionPane.PLAIN_MESSAGE);
	    }
	  }
	}