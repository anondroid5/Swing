package com.swing.highconponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JListSample6 extends JFrame implements ActionListener{

  /**
	 * JList
  */
	private static final long serialVersionUID = 4872746167531590749L;
protected JList list;
  protected JTextField selectText;

  public static void main(String[] args){
    JListSample test = new JListSample("JListSample");

    /* 終了処理を変更 */
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    test.setBounds( 10, 10, 250, 180);
    test.setVisible(true);
  }

  JListSample6(String title){
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

    selectText = new JTextField(8);

    JButton selectButton = new JButton("Select");
    selectButton.addActionListener(this);
    selectButton.setActionCommand("selectButton");

    JPanel p2 = new JPanel();
    p2.add(selectText);
    p2.add(selectButton);

    getContentPane().add(p2, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e){
    String actionCommand = e.getActionCommand();

    String selectVal = selectText.getText();

    if (actionCommand.equals("selectButton")){
      list.setSelectedValue(selectVal, true);
    }else{
      return;
    }
  }
}