package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JScrollPaneTest8 extends JFrame{
	
	/**
	 * JScrollPane
	 * ビューポートに配置したいコンポーネントを指定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -4968529952337253015L;

	public static void main(String[] args){
	    JScrollPaneTest8 frame = new JScrollPaneTest8();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest8(){
	    JScrollPane scrollpane = new JScrollPane();
	    scrollpane.setPreferredSize(new Dimension(200, 120));

	    JViewport view = scrollpane.getViewport();

	    ImageIcon icon = new ImageIcon("./img/hana.jpg");
	    JLabel label = new JLabel(icon);
	    view.setView(label);

	    JPanel panel = new JPanel();
	    panel.add(scrollpane);

	    getContentPane().add(panel, BorderLayout.CENTER);
	  }

}
