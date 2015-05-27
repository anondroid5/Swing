package com.swing.layout.manager;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class FlowLayoutTest3 extends JFrame{
	
	/**
	 * FlowLayoutクラスのコンポーネント間の間隔を
	 * setVgap,setHgapで調整する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 7639629406385691482L;

	public static void main(String[] args){
	    FlowLayoutTest3 frame = new FlowLayoutTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 300, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  FlowLayoutTest3(){
	    JButton button1 = new JButton("Button1");
	    JButton button2 = new JButton("Button2");
	    JButton button3 = new JButton("Button3");
	    JButton button4 = new JButton("Button4");

	    JPanel p = new JPanel();
	    //FlowLayout layout = new FlowLayout();
	    //layout.setHgap(10);
	    //layout.setVgap(5);
	    p.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 30));
	    p.add(button1);
	    p.add(button2);
	    p.add(button3);
	    p.add(button4);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }

}
