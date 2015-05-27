package com.swing.event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Sample012 extends JFrame{
	/**
	 * getButton()メソッド
	 * 状態が更新されたボタンの判定
	 * 左ボタン（1）,右ボタン(3),真ん中ボタン(2)
	 * マウスイベント処理
	 */
	private static final long serialVersionUID = -6207871292944446690L;
	protected JList list;
	protected DefaultListModel model;
	
	public static void main(String[] args){
		Sample012 test = new Sample012("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample012(String title){
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
	      model.addElement("mouseClicked " + e.getButton());
	      list.ensureIndexIsVisible(model.getSize() - 1);
	    }
	  }

}
