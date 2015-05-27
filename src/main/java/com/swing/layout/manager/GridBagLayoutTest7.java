package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;


public class GridBagLayoutTest7 extends JFrame{
	
	/**
	 * GridBagLayout
	 * コンポーネントの余白を設定
	 * 「insets」フィールド
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 6066454400576102130L;

	public static void main(String[] args){
	    GridBagLayoutTest7 frame = new GridBagLayoutTest7();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  GridBagLayoutTest7(){
	    GridBagLayout layout = new GridBagLayout();
	    JPanel p = new JPanel();
	    p.setLayout(layout);

	    GridBagConstraints gbc = new GridBagConstraints();

	    JButton button1 = new JButton("Google");

	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridheight = 2;
	    gbc.weightx = 1.0d;
	    gbc.weighty = 1.0d;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    gbc.insets = new Insets(10, 0, 10, 0);
	    layout.setConstraints(button1, gbc);

	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));

	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gbc.gridheight = 1;
	    gbc.weightx = 1.0d;
	    gbc.weighty = 1.0d;
	    gbc.fill = GridBagConstraints.BOTH;
	    gbc.insets = new Insets(5, 5, 5, 5);
	    layout.setConstraints(button2, gbc);

	    JButton button3 = new JButton("MSN");

	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    gbc.weightx = 1.0d;
	    gbc.weighty = 1.0d;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.insets = new Insets(0, 0, 0, 0);
	    layout.setConstraints(button3, gbc);

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
