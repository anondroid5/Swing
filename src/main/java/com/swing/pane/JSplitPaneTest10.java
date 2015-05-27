package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest10 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * setOneTouchExpandable()-収納、展開用ボタンの設置
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -576429521939929686L;

	public static void main(String[] args){
	    JSplitPaneTest10 frame = new JSplitPaneTest10();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest10(){
	    JSplitPane splitpane = new JSplitPane();
	    splitpane.setOneTouchExpandable(true);

	    JPanel leftPanel = new JPanel();
	    JButton leftButton = new JButton("Left");
	    leftPanel.add(leftButton);

	    JPanel rightPanel = new JPanel();
	    JButton rightButton = new JButton("Right");
	    rightPanel.add(rightButton);

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	  }
	}