package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JSplitPaneTest7 extends JFrame implements ActionListener{

	  /**
	   * JSplitPaneクラス
	   * 仕切線の左側とスプリットペインの左端からの距離
	   * getMinimumDividerLocation()-移動可能な最小値
	   * getMaximumDividerLocation()-移動可能な最大値
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2026628610671990256L;
	JSplitPane splitpane;
	  JLabel minLabel;
	  JLabel maxLabel;

	  public static void main(String[] args){
	    JSplitPaneTest7 frame = new JSplitPaneTest7();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest7(){
	    splitpane = new JSplitPane();

	    JPanel leftPanel = new JPanel();
	    JButton leftButton = new JButton("Left");
	    leftPanel.add(leftButton);

	    JPanel rightPanel = new JPanel();
	    JButton rightButton = new JButton("Right");
	    rightPanel.add(rightButton);

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);

	    int min = splitpane.getMinimumDividerLocation();
	    minLabel = new JLabel("min:" + min);
	    int max = splitpane.getMaximumDividerLocation();
	    maxLabel = new JLabel("max:" + max);

	    JButton button = new JButton("get");
	    button.addActionListener(this);

	    JPanel labelPanel = new JPanel();
	    labelPanel.add(minLabel);
	    labelPanel.add(maxLabel);
	    labelPanel.add(button);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	    getContentPane().add(labelPanel, BorderLayout.PAGE_END);
	  }

	  public void actionPerformed(ActionEvent e){
	    int min = splitpane.getMinimumDividerLocation();
	    minLabel.setText("min:" + min);
	    int max = splitpane.getMaximumDividerLocation();
	    maxLabel.setText("max:" + max);
	  }
	}