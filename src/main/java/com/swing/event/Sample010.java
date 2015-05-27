package com.swing.event;

import javax.swing.*;

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Sample010 extends JFrame{
	/**
	 * MouseAdapterクラスはMouseListenerインターフェースと違い
	 * 5つのメソッドを全て使用する必要がない
	 * 必要なマウスイベント処理を登録して使用できる
	 * サンプルプログラム(実践向け)
	 */
	private static final long serialVersionUID = 1L;
	protected JList<String> list;
	protected DefaultListModel<String> model;

	public static void main(String[] args){
	    Sample010 test = new Sample010("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	
	Sample010(String title){
	    setTitle(title);
	    setBounds( 10, 10, 300, 200);

	    model = new DefaultListModel<String>();
	    list = new JList<String>(model);

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
	      /* 必要なメソッドだけ自分で再度定義 */
	      model.addElement("mouseClicked");
	      list.ensureIndexIsVisible(model.getSize() - 1);
	    }
	  }
	
}
