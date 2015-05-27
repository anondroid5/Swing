package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

public class GridBagLayoutTest1 extends JFrame{
	
	/**
	 * GridBagLayoutクラス
	 * 「gridx」フィールドと「gridy」フィールドの設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -5557792992361852335L;

	public static void main(String[] args){
	    GridBagLayoutTest1 frame = new GridBagLayoutTest1();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  GridBagLayoutTest1(){
	    GridBagLayout layout = new GridBagLayout();
	    JPanel p = new JPanel();
	    p.setLayout(layout);

	    GridBagConstraints gbc = new GridBagConstraints();

	    JButton button1 = new JButton("Google");

	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    layout.setConstraints(button1, gbc);

	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));

	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    layout.setConstraints(button2, gbc);

	    JButton button3 = new JButton("MSN");

	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    layout.setConstraints(button3, gbc);

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
