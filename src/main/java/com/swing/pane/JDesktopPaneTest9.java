package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest9 extends JFrame{

  /**
   * JDesktopPaneクラス
   * setLayer()-インターナルフレームのレイヤーの値を設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -46772711092266107L;

public static void main(String[] args){
    JDesktopPaneTest9 frame = new JDesktopPaneTest9();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 400, 300);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JDesktopPaneTest9(){
    JDesktopPane desktop = new JDesktopPane();

    JInternalFrame iframe1 = new JInternalFrame();
    iframe1.setSize(250, 120);
    iframe1.setLocation(10, 10);
    iframe1.setVisible(true);
    int layer1 = iframe1.getLayer();
    iframe1.setTitle("IFrame1[" + layer1 + "]");

    JInternalFrame iframe2 = new JInternalFrame();
    iframe2.setSize(250, 120);
    iframe2.setLocation(20, 80);
    iframe2.setVisible(true);
    int layer2 = iframe2.getLayer();
    iframe2.setTitle("IFrame2[" + layer2 + "]");

    JInternalFrame iframe3 = new JInternalFrame();
    iframe3.setSize(250, 120);
    iframe3.setLocation(100, 50);
    iframe3.setVisible(true);
    iframe3.setLayer(1);
    int layer3 = iframe3.getLayer();
    iframe3.setTitle("IFrame3[" + layer3 + "]");

    desktop.add(iframe1);
    desktop.add(iframe2);
    desktop.add(iframe3);

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}