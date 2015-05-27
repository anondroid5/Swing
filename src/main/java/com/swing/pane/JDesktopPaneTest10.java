package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;
import java.beans.PropertyVetoException;
import java.awt.event.*;

public class JDesktopPaneTest10 extends JFrame implements ActionListener{

  /**
   * JDesktopPaneクラス
   * setSelected()-インターナルフレームを選択状態にする
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -5661969809246672222L;
JDesktopPane desktop;
  int frameCount;

  public static void main(String[] args){
    JDesktopPaneTest10 frame = new JDesktopPaneTest10();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 400, 300);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JDesktopPaneTest10(){
    desktop = new JDesktopPane();
    frameCount = 1;

    JInternalFrame iframe = new JInternalFrame("IFrame" + frameCount);
    iframe.setSize(250, 120);
    iframe.setLocation(10 + frameCount * 10, 10 + frameCount * 10);
    iframe.setVisible(true);
    frameCount++;

    desktop.add(iframe);

    JButton button = new JButton("add");
    button.addActionListener(this);

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(button);

    getContentPane().add(desktop, BorderLayout.CENTER);
    getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    JInternalFrame iframe = new JInternalFrame("IFrame" + frameCount);
    iframe.setSize(250, 120);
    iframe.setLocation(10 + frameCount * 10, 10 + frameCount * 10);
    iframe.setVisible(true);
    frameCount++;

    desktop.add(iframe);

    try{
      iframe.setSelected(true);
    }catch(PropertyVetoException ex){
      System.out.println(ex.getMessage());
    }
  }
}