package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

public class GridBagLayoutTest5 extends JFrame{

	 /**
	  * GridBagLayout
	  * セルのどの場所にコンポーネントを表示するか
	  * 絶対と相対の両方がある
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -1500563681141466167L;

	public static void main(String[] args){
		    GridBagLayoutTest5 frame = new GridBagLayoutTest5();

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(10, 10, 300, 200);
		    frame.setTitle("タイトル");
		    frame.setVisible(true);
		  }

		  GridBagLayoutTest5(){
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
		    gbc.anchor = GridBagConstraints.NORTHWEST;
		    layout.setConstraints(button1, gbc);

		    JButton button2 = new JButton("Yahoo!");
		    button2.setFont(new Font("Arial", Font.PLAIN, 30));

		    gbc.gridx = 1;
		    gbc.gridy = 0;
		    gbc.gridheight = 1;
		    gbc.weightx = 1.0d;
		    gbc.weighty = 1.0d;
		    gbc.anchor = GridBagConstraints.NORTHEAST;
		    layout.setConstraints(button2, gbc);

		    JButton button3 = new JButton("MSN");

		    gbc.gridx = 1;
		    gbc.gridy = 1;
		    gbc.weightx = 1.0d;
		    gbc.weighty = 1.0d;
		    gbc.anchor = GridBagConstraints.SOUTH;
		    layout.setConstraints(button3, gbc);

		    p.add(button1);
		    p.add(button2);
		    p.add(button3);

		    getContentPane().add(p, BorderLayout.CENTER);
		  }
}
