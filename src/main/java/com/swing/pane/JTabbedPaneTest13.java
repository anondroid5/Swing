package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest13 extends JFrame{

	  /**
	   * JTabbedPaneクラス
	   * 追加されているタブの総数を取得
	   * getTabCount()-タブの総数を表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 6772907058454098824L;

	public static void main(String[] args){
	    JTabbedPaneTest13 frame = new JTabbedPaneTest13();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JTabbedPaneTest13(){
	    JTabbedPane tabbedpane = new JTabbedPane();

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

	    JLabel countLabel = new JLabel();
	    countLabel.setText("Tab Count : " + tabbedpane.getTabCount());

	    JPanel labelPanel = new JPanel();
	    labelPanel.add(countLabel);

	    getContentPane().add(tabbedpane, BorderLayout.CENTER);
	    getContentPane().add(labelPanel, BorderLayout.PAGE_END);
	  }
	}