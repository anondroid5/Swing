package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest5 extends JFrame{
	
	/**
	 * BoxLayoutで配置されるコンポーネント
	 * setgetMaximumSize()メソッド-　最大サイズ設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 3321584830883648799L;

	public static void main(String[] args){
	    BoxLayoutTest5 frame = new BoxLayoutTest5();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  BoxLayoutTest5(){
	    JButton button1 = new JButton("Google");
	    int height = button1.getMaximumSize().height;
	    button1.setMaximumSize(new Dimension(Short.MAX_VALUE, height));

	    JButton button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));

	    JButton button3 = new JButton("MSN");

	    JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
