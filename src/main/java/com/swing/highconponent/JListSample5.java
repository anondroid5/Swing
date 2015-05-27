package com.swing.highconponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JListSample5 extends JFrame implements ActionListener{

	/* 
	 * JList
	 */
	private static final long serialVersionUID = 1197640608102850301L;
  protected JList list;
  protected JTextField startText;
  protected JTextField endText;

  public static void main(String[] args){
    JListSample test = new JListSample("JListSample");

    /* 終了処理を変更 */
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    test.setBounds( 10, 10, 250, 180);
    test.setVisible(true);
  }

  JListSample5(String title){
    setTitle(title);

    /* JListの初期データ */
    String[] initData = {"Blue", "Green", "Red", "Whit", "Black"};
    list = new JList(initData);

    JScrollPane sp = new JScrollPane();
    sp.getViewport().setView(list);
    sp.setPreferredSize(new Dimension(200, 80));

    JPanel p = new JPanel();
    p.add(sp);

    getContentPane().add(p, BorderLayout.CENTER);

    startText = new JTextField(2);
    endText = new JTextField(2);

    JButton addButton = new JButton("Add");
    addButton.addActionListener(this);
    addButton.setActionCommand("addButton");

    JButton removeButton = new JButton("Remove");
    removeButton.addActionListener(this);
    removeButton.setActionCommand("removeButton");

    JPanel p2 = new JPanel();
    p2.add(startText);
    p2.add(endText);
    p2.add(addButton);
    p2.add(removeButton);

    getContentPane().add(p2, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e){
    String actionCommand = e.getActionCommand();

    int start = Integer.parseInt(startText.getText().toString());
    int end = Integer.parseInt(endText.getText().toString());

    if (actionCommand.equals("addButton")){
      list.addSelectionInterval(start, end);
    }else if (actionCommand.equals("removeButton")){
      list.removeSelectionInterval(start, end);
    }else{
      return;
    }
  }
}