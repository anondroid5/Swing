package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest6 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * 仕切線の位置の指定
	   * setDividerLocation()メソッド
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -5763955087178020965L;

	public static void main(String[] args){
	    JSplitPaneTest6 frame = new JSplitPaneTest6();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest6(){
	    JSplitPane splitpane = new JSplitPane();

	    JPanel leftPanel = new JPanel();
	    JButton leftButton = new JButton("Left");
	    leftPanel.add(leftButton);

	    JPanel rightPanel = new JPanel();
	    JButton rightButton = new JButton("Right");
	    rightPanel.add(rightButton);

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);
	    splitpane.setDividerLocation(140);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	  }
	}