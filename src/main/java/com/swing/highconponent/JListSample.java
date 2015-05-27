package com.swing.highconponent;

import javax.swing.*;
import java.awt.*;

public class JListSample extends JFrame{

  /**
   * JList
  */
	private static final long serialVersionUID = -1645052480334671920L;

public static void main(String[] args){
    JListSample test = new JListSample("JListSample");

    /* 終了処理を変更 */
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    test.setBounds( 10, 10, 250, 130);
    test.setVisible(true);
  }

  JListSample(String title){
    setTitle(title);

    /* JListの初期データ */
    String[] initData = {"Blue", "Green", "Red", "Whit", "Black"};
    JList list = new JList(initData);

    JScrollPane sp = new JScrollPane();
    sp.getViewport().setView(list);
    sp.setPreferredSize(new Dimension(200, 80));

    JPanel p = new JPanel();
    p.add(sp);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}