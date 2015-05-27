package com.swing.pane;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Point;
import javax.swing.event.*;

public class JScrollPaneTest9 extends JFrame implements ChangeListener{
	
	/**
	 * JScrollPane
	 * getViewPosition()-表示されているかの位置を取得
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -2934091097921556291L;
	JViewport view;
	  JLabel positionLabel;

	  public static void main(String[] args){
	    JScrollPaneTest9 frame = new JScrollPaneTest9();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  JScrollPaneTest9(){
	    JScrollPane scrollpane = new JScrollPane();
	    scrollpane.setPreferredSize(new Dimension(200, 120));

	    view = scrollpane.getViewport();

	    ImageIcon icon = new ImageIcon("./img/hana.jpg");
	    JLabel label = new JLabel(icon);
	    view.setView(label);

	    view.addChangeListener(this);

	    positionLabel = new JLabel("位置を表示");

	    JPanel panel = new JPanel();
	    panel.add(scrollpane);

	    getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().add(positionLabel, BorderLayout.PAGE_END);
	  }

	  public void stateChanged(ChangeEvent e){
	    Point point = view.getViewPosition();
	    positionLabel.setText("x：" + point.x + ", y:" + point.y);
	  }

}
