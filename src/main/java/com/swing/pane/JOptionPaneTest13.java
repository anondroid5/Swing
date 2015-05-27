package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest13 extends JFrame implements ActionListener{

	  /**
	   * JOptionPaneクラス
	   * showOptionDialog()
	   * カスタムボタンの選択ダイアログの表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -9190891861044066919L;
	JLabel ansLabel;

	  public static void main(String[] args){
	    JOptionPaneTest13 frame = new JOptionPaneTest13();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JOptionPaneTest13(){
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
	    String selectvalues[] = {"読書", "ドライブ", "映画", "スポーツ"};

	    int select = JOptionPane.showOptionDialog(this,
	      "休日の過ごし方は？", 
	      "休日の過ごし方", 
	      JOptionPane.YES_NO_OPTION,
	      JOptionPane.QUESTION_MESSAGE,
	      null, 
	      selectvalues, 
	      selectvalues[0]
	    );

	    if (select == JOptionPane.CLOSED_OPTION){
	      ansLabel.setText("選択されずに閉じられました");
	    }else{
	      ansLabel.setText(selectvalues[select]);
	    }
	  }
	}