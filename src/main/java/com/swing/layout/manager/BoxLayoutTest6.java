package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest6 extends JFrame{
	
	/**
	 * BoxLayoutで配置されるコンポーネント
	 * Short.MAX_VALUE-幅も高さも十分大きい値に設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 7299842511345773937L;

	public static void main(String[] args){
	    BoxLayoutTest6 frame = new BoxLayoutTest6();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  BoxLayoutTest6(){
	    JButton button1 = new JButton("Google");
	    button1.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));
	    button2.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

	    JButton button3 = new JButton("MSN");
	    button3.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

	    JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
