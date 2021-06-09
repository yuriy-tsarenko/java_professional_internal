package com.java_professional.examples.lesson8.example4;

import com.java_professional.examples.lesson8.ProgressBar;

import java.util.ArrayList;
import java.util.List;


public class MainPriority {

    private static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {


        Runnable job = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from: " + Thread.currentThread().getName());
                System.out.println("priority: " + Thread.currentThread().getPriority());
                System.out.println("id: " + Thread.currentThread().getId());
                ProgressBar progressBar = new ProgressBar();
                for (int i = 1; i <= 50; i++) {
                    progressBar.setProgress(i, 50);
                    addValue(i);
                }
                System.out.println("task executed: " + Thread.currentThread().getName());
            }
        };

        Thread firstThread = new Thread(job);
        Thread secondThread = new Thread(job);
        Thread thirdThread = new Thread(job);
        Thread fourthThread = new Thread(job);

        firstThread.setName("FIRST");
        secondThread.setName("SECOND");
        thirdThread.setName("THIRD");
        fourthThread.setName("FOURTH");

        firstThread.setPriority(Thread.MAX_PRIORITY);
        secondThread.setPriority(Thread.MAX_PRIORITY);
        thirdThread.setPriority(Thread.MAX_PRIORITY);
        thirdThread.setPriority(Thread.MAX_PRIORITY);
        fourthThread.setPriority(Thread.MIN_PRIORITY);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();

    }

    public static synchronized void addValue(Integer value) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(value);
    }
}
