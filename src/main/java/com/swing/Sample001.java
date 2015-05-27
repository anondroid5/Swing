package com.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sample001 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextField text;
	
	public static void main(String args[]){
	    Sample001 frame = new Sample001("タイトル");
	    frame.setVisible(true);
	  }
	Sample001(String title){
	    setTitle(title);
	    setBounds(100, 100, 300, 250);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel p = new JPanel();

	    text = new JTextField("住所", 20);
	    text.select(0, 1);
	    JButton button = new JButton("全て選択");
	    button.addActionListener(this);

	    p.add(text);
	    p.add(button);

	    Container contentPane = getContentPane();
	    contentPane.add(p, BorderLayout.CENTER);
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		text.requestFocusInWindow();
	    text.selectAll();
	}
	

}
