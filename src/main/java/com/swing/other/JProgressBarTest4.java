package com.swing.other;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JProgressBarTest4 extends JFrame implements ActionListener{

  /**
	 * JProgressBarTest4
	 * 進捗バーに最小値と最大値を設定する
	 * 0~300までを設定している
	 */
	private static final long serialVersionUID = -1384854419880089637L;
Timer timer;
  JButton startButton;
  JButton stopButton;
  JProgressBar bar;
  JLabel label;
  int count;

  public static void main(String[] args){
    JProgressBarTest4 frame = new JProgressBarTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JProgressBarTest4(){
    count = 0;
    label = new JLabel("Not Start");

    JPanel labelPanel = new JPanel();
    labelPanel.add(label);

    startButton = new JButton("start");
    startButton.addActionListener(this);
    startButton.setActionCommand("start");

    stopButton = new JButton("stop");
    stopButton.addActionListener(this);
    stopButton.setActionCommand("stop");
    stopButton.setEnabled(false);

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(startButton);
    buttonPanel.add(stopButton);

    bar = new JProgressBar(0, 300);
    bar.setValue(0);

    JPanel barPanel = new JPanel();
    barPanel.add(bar);

    timer = new Timer(100 , this);
    timer.setActionCommand("timer");

    getContentPane().add(labelPanel, BorderLayout.PAGE_START);
    getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
    getContentPane().add(barPanel, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    String cmd = e.getActionCommand();

    if (cmd.equals("start")){
      startButton.setEnabled(false);
      stopButton.setEnabled(true);

      timer.start();
    }else if (cmd.equals("stop")){
      startButton.setEnabled(true);
      stopButton.setEnabled(false);

      timer.stop();
    }else if (cmd.equals("timer")){
      label.setText(count + " count");

      if (count >= 300){
        startButton.setEnabled(true);
        stopButton.setEnabled(false);

        timer.stop();

        bar.setValue(count);

        count = 0;
      }else{
        count++;
        bar.setValue(count);
      }
    }
  }
}