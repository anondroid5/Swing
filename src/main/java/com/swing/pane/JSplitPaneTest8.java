package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JSplitPaneTest8 extends JFrame implements ActionListener{

	  /**
	   * JSplitPaneクラス
	   * getDividerLocation()-仕切線(ディバイダ)の現在の値を取得
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 7329895056688805432L;
	JSplitPane splitpane;
	  JLabel posLabel;

	  public static void main(String[] args){
	    JSplitPaneTest8 frame = new JSplitPaneTest8();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest8(){
	    splitpane = new JSplitPane();

	    JPanel leftPanel = new JPanel();
	    JButton leftButton = new JButton("Left");
	    leftPanel.add(leftButton);

	    JPanel rightPanel = new JPanel();
	    JButton rightButton = new JButton("Right");
	    rightPanel.add(rightButton);

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);

	    posLabel = new JLabel("pos:");

	    JButton button = new JButton("get");
	    button.addActionListener(this);

	    JPanel labelPanel = new JPanel();
	    labelPanel.add(posLabel);
	    labelPanel.add(button);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	    getContentPane().add(labelPanel, BorderLayout.PAGE_END);
	  }

	  public void actionPerformed(ActionEvent e){
	    int pos = splitpane.getDividerLocation();
	    posLabel.setText("pos:" + pos);
	  }
	}