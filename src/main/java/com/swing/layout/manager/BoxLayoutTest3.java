package com.swing.layout.manager;

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.event.*;
import java.util.Hashtable;

public class BoxLayoutTest3 extends JFrame implements ChangeListener{
	
	/**
	 * BoxLayout
	 * 垂直方向の位置を変更する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = 1438343968616967128L;
	JSlider slider;
	  JButton button1;
	  JButton button2;
	  JButton button3;

	  public static void main(String[] args){
	    BoxLayoutTest3 frame = new BoxLayoutTest3();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 10, 350, 200);
	    frame.setTitle("タイトル");
	    frame.setVisible(true);
	  }

	  BoxLayoutTest3(){
	    button1 = new JButton("Google");
	    button1.setAlignmentY(0.5f);

	    button2 = new JButton("Yahoo!");
	    button2.setFont(new Font("Arial", Font.PLAIN, 30));
	    button2.setAlignmentY(0.5f);

	    button3 = new JButton("MSN");
	    button3.setAlignmentY(0.5f);

	    JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));

	    p.add(button1);
	    p.add(button2);
	    p.add(button3);

	    Hashtable<Integer, JComponent> table = new Hashtable<Integer, JComponent>();

	    table.put(new Integer(0), new JLabel("0.0f "));
	    table.put(new Integer(5), new JLabel("0.5f "));
	    table.put(new Integer(10), new JLabel("1.0f "));

	    slider = new JSlider(0, 10);
	    slider.setMajorTickSpacing(1);
	    slider.setPaintTicks(true);
	    slider.setOrientation(JSlider.VERTICAL);
	    slider.setInverted(true);
	    slider.setLabelTable(table);
	    slider.setPaintLabels(true);
	    slider.addChangeListener(this);

	    getContentPane().add(p, BorderLayout.CENTER);
	    getContentPane().add(slider, BorderLayout.LINE_END);
	  }

	  public void stateChanged(ChangeEvent e) {
	    float pos = (float)(slider.getValue()) / 10.0f;

	    button1.setAlignmentY(pos);
	    button2.setAlignmentY(pos);
	    button3.setAlignmentY(pos);

	    button1.revalidate();
	  }

}
