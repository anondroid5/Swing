package com.swing.highconponent;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class JListSample2 extends JFrame{

  /**
   * JList
  */
	private static final long serialVersionUID = -5462327174346825137L;

public static void main(String[] args){
    JListSample test = new JListSample("JListSample");

    /* 終了処理を変更 */
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    test.setBounds( 10, 10, 250, 130);
    test.setVisible(true);
  }

  JListSample2(String title){
    setTitle(title);

    /* JListの初期データ */
    Vector<String> initData = new Vector<String>();
    StringBuffer sb;
    for (int i = 0 ; i < 10 ; i++){
      sb = new StringBuffer();
      sb.append("リスト項目");
      sb.append(i);
      sb.append("番目");
      initData.add(new String(sb));
    }
    JList list = new JList(initData);

    JScrollPane sp = new JScrollPane();
    sp.getViewport().setView(list);
    sp.setPreferredSize(new Dimension(200, 80));

    JPanel p = new JPanel();
    p.add(sp);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}