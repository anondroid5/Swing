package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JTabbedPaneTest3 extends JFrame implements ActionListener{
	
	/**
	 * JTabbedPaneクラス
	 * タブを削除する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 6311538902623057587L;
	JTabbedPane tabbedpane;

	  public static void main(String[] args){
	    JTabbedPaneTest3 frame = new JTabbedPaneTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest3(){
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

	    JPanel buttonPanel = new JPanel();
	    JButton deleteButton = new JButton("delete");
	    deleteButton.addActionListener(this);

	    buttonPanel.add(deleteButton);

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	    getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
	  }

	  public void actionPerformed(ActionEvent e){
	    int index = tabbedpane.getSelectedIndex();

	    if (index != -1){
	      tabbedpane.remove(index);
	    }
	  }

}
