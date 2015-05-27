package com.swing.other;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JProgressBarTest6 extends JFrame implements ActionListener{

  /**
	 * JProgressBar
	 * setBorderPainted(false);
	 * 進捗バーの枠線を表示するかどうかを設定
	 * 枠線を表示しない
	 */
	private static final long serialVersionUID = 5412660027549909227L;
Timer timer;
  JButton startButton;
  JButton stopButton;
  JProgressBar bar;
  JLabel label;
  int count;

  public static void main(String[] args){
    JProgressBarTest6 frame = new JProgressBarTest6();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JProgressBarTest6(){
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

    bar = new JProgressBar(0, 200);
    bar.setStringPainted(true);
    bar.setBorderPainted(false);
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

      if (count >= 200){
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