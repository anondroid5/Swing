package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest13 extends JFrame{

  /**
   * JDesktopPaneクラス
   * setFrameIcon()-インターナルフレームの左上に表示される小さいアイコンを設定
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -7915683347123145963L;

public static void main(String[] args){
    JDesktopPaneTest13 frame = new JDesktopPaneTest13();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 400, 300);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JDesktopPaneTest13(){
    JDesktopPane desktop = new JDesktopPane();

    ImageIcon icon = new ImageIcon("./gif/new1.gif");

    JInternalFrame iframe1 = new JInternalFrame("IFrame1");
    iframe1.setSize(250, 150);
    iframe1.setLocation(10, 10);
    iframe1.setVisible(true);
    iframe1.setFrameIcon(icon);

    JInternalFrame iframe2 = new JInternalFrame("IFrame2");
    iframe2.setSize(250, 150);
    iframe2.setLocation(100, 100);
    iframe2.setVisible(true);

    desktop.add(iframe1);
    desktop.add(iframe2);

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}