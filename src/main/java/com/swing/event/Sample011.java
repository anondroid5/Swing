package com.swing.event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Sample011 extends JFrame{
	/**
	 * getClickCount()メソッドを使用して
	 * クリック数をカウントする（早く連続的に押さないとカウントされない）
	 * マウスイベント処理
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1L;
	protected JList list;
	protected DefaultListModel model;
	
	public static void main(String[] args){
		Sample011 test = new Sample011("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample011(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    model = new DefaultListModel();
	    list = new JList(model);

	    JScrollPane sp = new JScrollPane();
	    sp.getViewport().setView(list);
	    sp.setPreferredSize(new Dimension(200, 80));

	    JButton btn = new JButton("コンポーネント");
	    btn.addMouseListener(new myListener());

	    JPanel p = new JPanel();
	    p.add(btn);
	    p.add(sp);

	    getContentPane().add(p, BorderLayout.CENTER);
	  }
	
	public class myListener extends MouseAdapter{
	    public void mouseClicked(MouseEvent e){
	      model.addElement("mouseClicked" + e.getClickCount());
	      list.ensureIndexIsVisible(model.getSize() - 1);
	    }
	  }

}
