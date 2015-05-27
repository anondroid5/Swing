package com.swing.pane;

import javax.swing.*;
import java.awt.BorderLayout;

public class JScrollPaneTest1 extends JFrame{

  /**
	 * 
	 */
	private static final long serialVersionUID = -73614686789369325L;

public static void main(String[] args){
    JScrollPaneTest1 frame = new JScrollPaneTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JScrollPaneTest1(){
    ImageIcon icon = new ImageIcon("./img/hana.jpg");
    JLabel label = new JLabel(icon);
    JScrollPane scrollpane = new JScrollPane(label);

    getContentPane().add(scrollpane, BorderLayout.CENTER);
  }
}