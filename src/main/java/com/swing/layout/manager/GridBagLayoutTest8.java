package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

public class GridBagLayoutTest8 extends JFrame{
	
	 /**
	  * コンポーネントのパディングを設定する
	  * コンポーネントを大きくしたり、小さくしたりできる
	  * 「ipadx」フィールド
	  * 「ipady」フィールド
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 6732035485071489908L;

	public static void main(String[] args){
		    GridBagLayoutTest8 frame = new GridBagLayoutTest8();

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(10, 10, 300, 200);
		    frame.setTitle("タイトル");
		    frame.setVisible(true);
		  }

		  GridBagLayoutTest8(){
		    GridBagLayout layout = new GridBagLayout();
		    JPanel p = new JPanel();
		    p.setLayout(layout);

		    GridBagConstraints gbc = new GridBagConstraints();

		    JButton button1 = new JButton("Google");

		    gbc.gridx = 0;
		    gbc.gridy = 0;
		    gbc.gridheight = 2;
		    gbc.ipadx = 10;
		    layout.setConstraints(button1, gbc);

		    JButton button2 = new JButton("Yahoo!");
		    button2.setFont(new Font("Arial", Font.PLAIN, 30));

		    gbc.gridx = 1;
		    gbc.gridy = 0;
		    gbc.gridheight = 1;
		    gbc.ipadx = 0;
		    gbc.ipady = 20;
		    layout.setConstraints(button2, gbc);

		    JButton button3 = new JButton("MSN");

		    gbc.gridx = 1;
		    gbc.gridy = 1;
		    gbc.ipady = 0;
		    layout.setConstraints(button3, gbc);

		    p.add(button1);
		    p.add(button2);
		    p.add(button3);

		    getContentPane().add(p, BorderLayout.CENTER);
		  }

}
