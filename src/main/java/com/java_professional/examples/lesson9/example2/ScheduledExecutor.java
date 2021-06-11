package com.java_professional.examples.lesson9.example2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
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
                System.out.println("Hello from task");
            }
        };

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(runnable, 5, 2, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(runnable, 5, 2, TimeUnit.SECONDS);
    }
}
