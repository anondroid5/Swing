package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sample000 {
	public static void main(String args[]){
	    JFrame frame = new JFrame("タイトル");
	    //frame.setBounds(100, 100, 200, 160);windows 100,100の位置に表示
	    frame.setSize(200, 160);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    
	    JPanel panel = new JPanel();
	    JButton button = new JButton("O.K.");
	    panel.add(button);
	    frame.add(panel);
	  }
}
