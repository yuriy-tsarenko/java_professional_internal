package com.java_professional.examples.lesson8.example5;

public class MainDaemonThread {


    public static void main(String[] args) {

        Runnable mainJob = new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                for (int i = 1; i <= 4_000_000; i++) {
                    try {
                        Thread.sleep(1_000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(thread.getName() + " is daemon: " + thread.isDaemon());
                }
                System.out.println(thread.getName() + " is daemon: " + thread.isDaemon() + " stopped!");
            }

        };

        Runnable job = new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                for (int i = 1; i <= 1_000_000; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(thread.getName() + " is daemon: " + thread.isDaemon());
                }
                System.out.println(thread.getName() + " is daemon: " + thread.isDaemon() + " stopped!");
            }
        };

        Thread firstThread = new Thread(mainJob, "daemon-thread");
        Thread secondThread = new Thread(job, "regular-thread");

        firstThread.setDaemon(true);

        firstThread.start();
        secondThread.start();
    }
}
