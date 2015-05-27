package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest8 extends JFrame{

  /**
   * JDesktopPaneクラス
   * getLayer()-レイヤーの値を取得
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -3521819301481928441L;

public static void main(String[] args){
    JDesktopPaneTest8 frame = new JDesktopPaneTest8();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JDesktopPaneTest8(){
    JDesktopPane desktop = new JDesktopPane();

    JInternalFrame iframe1 = new JInternalFrame();
    iframe1.setSize(250, 120);
    iframe1.setLocation(10, 10);
    iframe1.setVisible(true);
    int layer1 = iframe1.getLayer();
    iframe1.setTitle("IFrame1[" + layer1 + "]");

    JInternalFrame iframe2 = new JInternalFrame();
    iframe2.setSize(250, 120);
    iframe2.setLocation(30, 30);
    iframe2.setVisible(true);
    int layer2 = iframe2.getLayer();
    iframe2.setTitle("IFrame2[" + layer2 + "]");

    desktop.add(iframe1);
    desktop.add(iframe2);

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}