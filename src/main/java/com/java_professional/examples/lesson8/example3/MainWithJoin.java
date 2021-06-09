package com.java_professional.examples.lesson8.example3;


import com.java_professional.examples.lesson8.ProgressBar;

public class MainWithJoin {
    public static void main(String[] args) {
        Runnable job = new Runnable() {
            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            @Override
            public void run() {
                System.out.println("Hello from: " + Thread.currentThread().getName());
                ProgressBar progressBar = new ProgressBar();
                for (int i = 1; i <= 50; i++) {
                    progressBar.setProgress(i, 50);
                }
                System.out.println("task executed: " + Thread.currentThread().getName());
            }
        };

        Thread firstThread = new Thread(job, "firstThread");
        Thread secondThread = new Thread(job, "secondThread");
        Thread thirdThread = new Thread(job, "thirdThread");

        try {
            thirdThread.start();
            thirdThread.join();//остальные потоки ждут выполнения третьего
            secondThread.start();
            firstThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
