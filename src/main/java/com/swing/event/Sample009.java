package com.swing.event;

import javax.swing.*;

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Sample009 extends JFrame implements MouseListener{
	/**
	 * MouseListener()インターフェースを利用して
	 * マウスイベント処理
	 * クリック（押して離す）、押す、離す、コンポーネントに入る、コンポーネントから出る
	 * 必要な5つのメソッドを全て定義しなければコンパイル時にエラーとなる
	 * サンプルプログラム(実践向けでない)
	 */
	private static final long serialVersionUID = 1L;
	protected JList<String> list;
	protected DefaultListModel<String> model;
	
	public static void main(String[] args){
	    Sample009 test = new Sample009("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample009(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    model = new DefaultListModel<String>();
	    list = new JList<String>(model);

	    JScrollPane sp = new JScrollPane();
	    sp.getViewport().setView(list);
	    sp.setPreferredSize(new Dimension(200, 80));

	    JButton btn = new JButton("コンポーネント");
	    btn.addMouseListener(this);

	    JPanel p = new JPanel();
	    p.add(btn);
	    p.add(sp);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }
	
	public void mouseClicked(MouseEvent e){
		 /* 処理したい内容をここに記述する */
	    model.addElement("mouseClicked");
	    list.ensureIndexIsVisible(model.getSize() - 1);
	  }

	  public void mouseEntered(MouseEvent e){
		/* 処理したい内容をここに記述する */
		model.addElement("mouseEntered");
		list.ensureIndexIsVisible(model.getSize() - 1);
	  }

	  public void mouseExited(MouseEvent e){
		/* 処理したい内容をここに記述する */
		model.addElement("mouseExited");
	    list.ensureIndexIsVisible(model.getSize() - 1);
	  }

	  public void mousePressed(MouseEvent e){
		/* 処理したい内容をここに記述する */
	    model.addElement("mousePressed");
	    list.ensureIndexIsVisible(model.getSize() - 1);
	  }

	  public void mouseReleased(MouseEvent e){
		/* 処理したい内容をここに記述する */
	    model.addElement("mouseReleased");
	    list.ensureIndexIsVisible(model.getSize() - 1);
	  }
	
}
