package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.event.*;

public class JTabbedPaneTest14 extends JFrame implements ChangeListener{

	  /**
	   *  JTabbedPaneクラス
	   *  getSelectedIndex()メソッド-選択されているタブのインデックスの取得
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 4135605999949776685L;
	JTabbedPane tabbedpane;
	  JLabel indexLabel;

	  public static void main(String[] args){
	    JTabbedPaneTest14 frame = new JTabbedPaneTest14();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest14(){
	    indexLabel = new JLabel();

	    JPanel dispPanel = new JPanel();
	    dispPanel.add(indexLabel);

	    tabbedpane = new JTabbedPane();
	    tabbedpane.addChangeListener(this);

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

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	    getContentPane().add(dispPanel, BorderLayout.PAGE_END);
	  }

	  public void stateChanged(ChangeEvent e) {
	    int index = tabbedpane.getSelectedIndex();

	    indexLabel.setText("Selected Index ： " + index);
	  }
	}