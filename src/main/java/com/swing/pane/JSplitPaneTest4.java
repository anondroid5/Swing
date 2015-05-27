package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSplitPaneTest4 extends JFrame{

	  /**
	   * JSplitPaneクラス
	   * コンポーネントの推奨サイズを設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 4532060403669594413L;

	public static void main(String[] args){
	    JSplitPaneTest4 frame = new JSplitPaneTest4();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JSplitPaneTest4(){
	    JSplitPane splitpane = new JSplitPane();

	    JPanel leftPanel = new JPanel();
	    JButton leftButton = new JButton("Left");
	    leftPanel.add(leftButton);

	    Dimension pre = leftPanel.getPreferredSize();
	    Dimension max = leftPanel.getMaximumSize();
	    Dimension mix = leftPanel.getMinimumSize();
	    System.out.println("左側コンポーネント");
	    System.out.println("推奨:(" + pre.width + "," + pre.height + ")");
	    System.out.println("最大:(" + max.width + "," + max.height + ")");
	    System.out.println("最小:(" + mix.width + "," + mix.height + ")");

	    JPanel rightPanel = new JPanel();
	    JButton rightButton = new JButton("Right");
	    rightPanel.add(rightButton);

	    pre = rightPanel.getPreferredSize();
	    max = rightPanel.getMaximumSize();
	    mix = rightPanel.getMinimumSize();
	    System.out.println("右側コンポーネント");
	    System.out.println("推奨:(" + pre.width + "," + pre.height + ")");
	    System.out.println("最大:(" + max.width + "," + max.height + ")");
	    System.out.println("最小:(" + mix.width + "," + mix.height + ")");

	    splitpane.setLeftComponent(leftPanel);
	    splitpane.setRightComponent(rightPanel);

	    getContentPane().add(splitpane, BorderLayout.CENTER);
	  }
	}