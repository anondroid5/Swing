package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest12 extends JFrame{

  /**
   *  JDesktopPaneクラス
   *  setJMenuBar()-インターナルフレームにメニューバーの配置
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 2893378202434690295L;

public static void main(String[] args){
    JDesktopPaneTest12 frame = new JDesktopPaneTest12();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 400, 300);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JDesktopPaneTest12(){
    JDesktopPane desktop = new JDesktopPane();

    JInternalFrame iframe = new JInternalFrame("IFrame");
    iframe.setSize(250, 120);
    iframe.setLocation(10, 10);
    iframe.setVisible(true);

    JLabel label = new JLabel("Name");
    JTextField text = new JTextField("", 10);

    JPanel p = new JPanel();
    p.add(label);
    p.add(text);

    iframe.getContentPane().add(p, BorderLayout.CENTER);

    JMenuBar menuBar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenuItem item1 = new JMenuItem("Open");
    JMenuItem item2 = new JMenuItem("Close");
    menu1.add(item1);
    menu1.add(item2);

    JMenu menu2 = new JMenu("Edit");

    menuBar.add(menu1);
    menuBar.add(menu2);
    iframe.setJMenuBar(menuBar);

    desktop.add(iframe);

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}