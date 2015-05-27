package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest3 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * コンポーネントを配置
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -6863303814475984006L;

	public static void main(String[] args){
	    JSplitPaneTest3 frame = new JSplitPaneTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest3(){
	    JSplitPane splitpane = new JSplitPane();

	    JPanel leftPanel = new JPanel();
	    leftPanel.add(new JButton("button1"));

	    JPanel rightPanel = new JPanel();
	    rightPanel.add(new JLabel("Name:"));
	    rightPanel.add(new JTextField("", 10));

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	  }
	}