package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest8 extends JFrame{
	
	 /**
	  * BoxLayoutクラス
	  * createGlue()メソッド-可変長の透明なオブジェクトをコンポーネント間に挿入
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -6351733279759947951L;

	public static void main(String[] args){
		    BoxLayoutTest8 frame = new BoxLayoutTest8();

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(10, 10, 300, 200);
		    frame.setTitle("タイトル");
		    frame.setVisible(true);
		  }

		  BoxLayoutTest8(){
		    JButton button1 = new JButton("Google");
		    JButton button2 = new JButton("Yahoo!");
		    button2.setFont(new Font("Arial", Font.PLAIN, 30));
		    JButton button3 = new JButton("MSN");

		    JPanel p = new JPanel();
		    p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));

		    p.add(button1);
		    p.add(button2);
		    p.add(Box.createGlue());
		    p.add(button3);

		    getContentPane().add(p, BorderLayout.CENTER);
		  }

}
