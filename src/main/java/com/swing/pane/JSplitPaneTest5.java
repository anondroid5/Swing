package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSplitPaneTest5 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * 仕切線の移動範囲の拡大
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 3256786115112309136L;

	public static void main(String[] args){
	    JSplitPaneTest5 frame = new JSplitPaneTest5();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest5(){
	    JSplitPane splitpane = new JSplitPane();

	    JPanel leftPanel = new JPanel();
	    JButton leftButton = new JButton("Right");
	    leftPanel.add(leftButton);
	    leftPanel.setMinimumSize(new Dimension(0,0));

	    JPanel rightPanel = new JPanel();
	    JButton rightButton = new JButton("Right");
	    rightPanel.add(rightButton);
	    rightPanel.setMinimumSize(new Dimension(0,0));

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	  }
	}