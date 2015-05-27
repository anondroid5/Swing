package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Point;

public class JScrollPaneTest10 extends JFrame{

	  /**
	   * JScrollPane
	   * setViewPosition()-ビューポート内でコンポーネントが表示される位置を設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2103943725074632323L;

	public static void main(String[] args){
	    JScrollPaneTest10 frame = new JScrollPaneTest10();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest10(){
	    JScrollPane scrollpane = new JScrollPane();
	    scrollpane.setPreferredSize(new Dimension(200, 120));

	    JViewport view = scrollpane.getViewport();

	    ImageIcon icon = new ImageIcon("./img/hana.jpg");
	    JLabel label = new JLabel(icon);
	    view.setView(label);

	    view.setViewPosition(new Point(50, 50));

	    JPanel panel = new JPanel();
	    panel.add(scrollpane);

	    getContentPane().add(panel, BorderLayout.CENTER);
	  }
	}