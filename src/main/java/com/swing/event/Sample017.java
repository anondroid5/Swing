package com.swing.event;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.BorderLayout;

public class Sample017 extends JFrame implements ChangeListener{
	/**
	 * ChangeListenerインターフェース
	 * Sliderの値を取得して表示する
	 * サンプルプログラム
	 */
	private static final long serialVersionUID = -8738069766847895934L;
	JLabel label = new JLabel("スライダーの値");

	  public static void main(String[] args){
		  Sample017 test = new Sample017("SwingTest");

	    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    test.setVisible(true);
	  }
	  
	  Sample017(String title){
		    setTitle(title);
		    setBounds( 10, 10, 300, 200);

		    JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		    slider.addChangeListener(this);

		    JPanel p = new JPanel();
		    p.add(slider);

		    getContentPane().add(p, BorderLayout.CENTER);
		    getContentPane().add(label, BorderLayout.PAGE_END);
		  }
	  public void stateChanged(ChangeEvent e) {
		  /* 処理したい内容をここに記述する */
		    JSlider source = (JSlider)e.getSource();

		    int fps = (int)source.getValue();
		    label.setText("値：" + fps);
		  }

}
