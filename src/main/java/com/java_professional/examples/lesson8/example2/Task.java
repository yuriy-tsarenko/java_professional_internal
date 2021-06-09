package com.java_professional.examples.lesson8.example2;

import com.java_professional.examples.lesson8.ProgressBar;

public class Task implements Runnable {

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
        ProgressBar progressBar = new ProgressBar();
        //        логика выполняемая потоком
        for (int i = 1; i <= 100; i++) {
            progressBar.setProgress(i, 100);
        }
    }

}
