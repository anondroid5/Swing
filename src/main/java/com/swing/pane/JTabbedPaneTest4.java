package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest4 extends JFrame{


  /**
   * JTabbedPane
   * addTab()でのアイコン追加
   * setIconAt()でのアイコン追加
   * タイトルと画像を指定してタブを追加
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -8390518353840340356L;

public static void main(String[] args){
    JTabbedPaneTest4 frame = new JTabbedPaneTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JTabbedPaneTest4(){
    JTabbedPane tabbedpane = new JTabbedPane();

    JPanel tabPanel1 = new JPanel();
    tabPanel1.add(new JButton("button1"));

    JPanel tabPanel2 = new JPanel();
    tabPanel2.add(new JLabel("Name:"));
    tabPanel2.add(new JTextField("", 10));

    JPanel tabPanel3 = new JPanel();
    tabPanel3.add(new JButton("button2"));

    ImageIcon icon1 = new ImageIcon("./gif/new1.gif");
    ImageIcon icon2 = new ImageIcon("./gif/enter.gif");

    tabbedpane.addTab("tab1", icon1, tabPanel1);
    tabbedpane.addTab("tab2", tabPanel2);
    tabbedpane.addTab("tab3", tabPanel3);

    tabbedpane.setIconAt(1, icon2);

    getContentPane().add(tabbedpane, BorderLayout.CENTER);
  }
}