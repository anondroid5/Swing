package com.swing.event;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;

public class Sample013 extends JFrame{

	/**
	 * getPoint()メソッド
	 * マウスイベント処理
	 * コンポーネットを基準とする相対x座標,y座標
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 822340568387270143L;
	protected JList list;
	protected DefaultListModel model;
	
	public static void main(String[] args){
	    Sample013 test = new Sample013("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample013(String title){
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
	      Point p = e.getPoint();
	      model.addElement("mouseClicked " + "x:" + p.getX() + ",y:" + p.getY());
	      list.ensureIndexIsVisible(model.getSize() - 1);
	    }
	  }
}
