package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

public class GridBagLayoutTest4 extends JFrame{
	
	/**
	 * GridBagLayout
	 * weightxフィールド、weightyフィールド
	 * 余分な領域の分配方法
	 * コンポーネントに対する重みづけの値double型
	 * 1列目のコンポーネントに100%
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 9169587765692649138L;

	public static void main(String[] args){
	    GridBagLayoutTest4 frame = new GridBagLayoutTest4();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("ƒ^ƒCƒgƒ‹");
	    frame.setVisible(true);
	  }

	  GridBagLayoutTest4(){
	    GridBagLayout layout = new GridBagLayout();
	    JPanel p = new JPanel();
	    p.setLayout(layout);

	    GridBagConstraints gbc = new GridBagConstraints();

	    JButton button1 = new JButton("Google");

	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridheight = 2;
	    gbc.weightx = 1.0d;
	    gbc.weighty = 0.0d;
	    layout.setConstraints(button1, gbc);

	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));

	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gbc.gridheight = 1;
	    gbc.weightx = 0.0d;
	    gbc.weighty = 1.0d;
	    layout.setConstraints(button2, gbc);

	    JButton button3 = new JButton("MSN");

	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    gbc.weightx = 0.0d;
	    gbc.weighty = 0.5d;
	    layout.setConstraints(button3, gbc);

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
