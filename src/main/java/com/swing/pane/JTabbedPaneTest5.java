package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest5 extends JFrame{
	
	 /**
	  * JTabbedPaneクラス
	  * タブに関するヒント(Tip)を表示
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -1908577891557124742L;

	public static void main(String[] args){
		    JTabbedPaneTest5 frame = new JTabbedPaneTest5();

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(10, 10, 300, 200);
		    frame.setTitle("タイトル");
		    frame.setVisible(true);
		  }

		  JTabbedPaneTest5(){
		    JTabbedPane tabbedpane = new JTabbedPane();

		    JPanel tabPanel1 = new JPanel();
		    tabPanel1.add(new JButton("button1"));

		    JPanel tabPanel2 = new JPanel();
		    tabPanel2.add(new JLabel("Name:"));
		    tabPanel2.add(new JTextField("", 10));

		    JPanel tabPanel3 = new JPanel();
		    tabPanel3.add(new JButton("button2"));

		    tabbedpane.addTab("tab1", null, tabPanel1, "button tab");
		    tabbedpane.addTab("tab2", tabPanel2);
		    tabbedpane.addTab("tab3", tabPanel3);

		    tabbedpane.setToolTipTextAt(1, "label & text tab");;
		    tabbedpane.setToolTipTextAt(2, "button tab");;

		    getContentPane().add(tabbedpane, BorderLayout.CENTER);
		  }

}
