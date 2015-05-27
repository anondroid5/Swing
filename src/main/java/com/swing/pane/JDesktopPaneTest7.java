package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest7 extends JFrame{

  /**
	 * JDesktopPaneクラス
	 * JInternalFrame("title", true, true, true, true)
	 * setMaximizable()-最大化ボタン
	 * setClosable()-クローズボタン
	 * setVisible()-アイコン化ボタン
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 3690826330080664078L;

public static void main(String[] args){
    JDesktopPaneTest7 frame = new JDesktopPaneTest7();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JDesktopPaneTest7(){
    JDesktopPane desktop = new JDesktopPane();

    JInternalFrame iframe1 = new JInternalFrame("IFrame1", true,
      true, true, true);
    iframe1.setSize(250, 120);
    iframe1.setLocation(10, 10);
    iframe1.setVisible(true);

    JInternalFrame iframe2 = new JInternalFrame("IFrame2");
    iframe2.setSize(250, 120);
    iframe2.setLocation(30, 30);
    iframe2.setMaximizable(true);
    iframe2.setClosable(true);
    iframe2.setVisible(true);

    desktop.add(iframe1);
    desktop.add(iframe2);

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}