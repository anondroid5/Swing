package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSplitPaneTest12 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * setPreferredSize()-スプリットペインのサイズを指定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -4740252722336016622L;

	public static void main(String[] args){
	    JSplitPaneTest12 frame = new JSplitPaneTest12();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest12(){
	    JSplitPane splitpane = new JSplitPane();
	    splitpane.setPreferredSize(new Dimension(200, 150));

	    JPanel leftPanel = new JPanel();
	    JButton leftButton = new JButton("Left");
	    leftPanel.add(leftButton);

	    JPanel rightPanel = new JPanel();
	    JButton rightButton = new JButton("Right");
	    rightPanel.add(rightButton);

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);

	    JPanel p = new JPanel();
	    p.add(splitpane);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }
	}