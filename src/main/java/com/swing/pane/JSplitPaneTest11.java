package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest11 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * setContinuousLayout()メソッドを指定する
	   * ディバイダーの再描画方式を設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -5181210037192065803L;

	public static void main(String[] args){
	    JSplitPaneTest11 frame = new JSplitPaneTest11();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest11(){
	    JSplitPane splitpane = new JSplitPane();
	    splitpane.setContinuousLayout(true);

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