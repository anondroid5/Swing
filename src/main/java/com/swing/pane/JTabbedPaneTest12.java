package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JTabbedPaneTest12 extends JFrame implements ActionListener{

	  /**
	   * JTabbedPaneクラス
	   * タブの選択
	   * setSelectedIndex()メソッド
	   * 最初のタブのインデックスは「0」
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 3613702133455203642L;
	JTabbedPane tabbedpane;
	  JTextField indexText;

	  public static void main(String[] args){
	    JTabbedPaneTest12 frame = new JTabbedPaneTest12();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest12(){
	    tabbedpane = new JTabbedPane();

	    JPanel tabPanel1 = new JPanel();
	    tabPanel1.add(new JButton("button1"));

	    JPanel tabPanel2 = new JPanel();
	    tabPanel2.add(new JLabel("Name:"));
	    tabPanel2.add(new JTextField("", 10));

	    JPanel tabPanel3 = new JPanel();
	    tabPanel3.add(new JButton("button2"));

	    tabbedpane.addTab("tab1", tabPanel1);
	    tabbedpane.addTab("tab2", tabPanel2);
	    tabbedpane.addTab("tab3", tabPanel3);

	    indexText = new JTextField("", 2);
	    JButton selectButton = new JButton("select");
	    selectButton.addActionListener(this);

	    JPanel actionPanel = new JPanel();
	    actionPanel.add(indexText);
	    actionPanel.add(selectButton);

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	    getContentPane().add(actionPanel, BorderLayout.PAGE_END);
	  }

	  public void actionPerformed(ActionEvent e){
	    int index = Integer.parseInt(indexText.getText());
	    tabbedpane.setSelectedIndex(index);
	  }
	}