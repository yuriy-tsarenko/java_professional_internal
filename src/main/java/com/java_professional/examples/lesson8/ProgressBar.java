package com.java_professional.examples.lesson8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame {

    private final JProgressBar progressBar;

    public ProgressBar() {
        JFrame frame = new JFrame("Thread test: " + Thread.currentThread().getName());
        JPanel panel = new JPanel();

        frame.setSize(300, 80);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        progressBar = new JProgressBar(0, 2000);
        progressBar.setBounds(40, 40, 160, 30);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setVisible(true);

        panel.add(progressBar);
        frame.add(panel);
    }

    public void setProgress(int currentProgress, int estimatedSize) {
        int done = 2000;
        int itemCost = done / estimatedSize;
        int progress = currentProgress * itemCost;
        progressBar.setValue(progress);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
