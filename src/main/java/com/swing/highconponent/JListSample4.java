package com.swing.highconponent;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class JListSample4 extends JFrame implements ActionListener{

	 /**
	   * JList
	 */
	private static final long serialVersionUID = 1512639994488454019L;
protected JList<Object> list;

  public static void main(String[] args){
    JListSample test = new JListSample("JListSample");

    /* 終了処理を変更 */
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    test.setBounds( 10, 10, 250, 180);
    test.setVisible(true);
  }

  JListSample4(String title){
    setTitle(title);

    /* JListの初期データ */
    String[] initData = {"Blue", "Green", "Red", "Whit", "Black"};
    list = new JList<Object>(initData);

    JScrollPane sp = new JScrollPane();
    sp.getViewport().setView(list);
    sp.setPreferredSize(new Dimension(200, 80));

    JPanel p = new JPanel();
    p.add(sp);

    getContentPane().add(p, BorderLayout.CENTER);

    JButton indexButton = new JButton("Index");
    indexButton.addActionListener(this);
    indexButton.setActionCommand("indexButton");

    JButton indicesButton = new JButton("Indices");
    indicesButton.addActionListener(this);
    indicesButton.setActionCommand("indicesButton");

    JButton intervalButton = new JButton("Interval");
    intervalButton.addActionListener(this);
    intervalButton.setActionCommand("intervalButton");

    JPanel p2 = new JPanel();
    p2.add(indexButton);
    p2.add(indicesButton);
    p2.add(intervalButton);

    getContentPane().add(p2, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e){
    int[] indices = {0, 2, 4};
    String actionCommand = e.getActionCommand();

    if (actionCommand.equals("indexButton")){
      list.setSelectedIndex(1);
    }else if (actionCommand.equals("indicesButton")){
     list.setSelectedIndices(indices);
    }else if (actionCommand.equals("intervalButton")){
      list.setSelectionInterval(1,3);
    }else{
      return;
    }
  }
}