package com.java_professional.examples.lesson8.example1;

import org.apache.log4j.Logger;

import java.util.Date;

public class ThreadDemo extends Thread {

    private final Logger logger = Logger.getLogger(ThreadDemo.class);
    private final long timeOut;

    public ThreadDemo(long timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public void run() {
        //        логика выполняемая потоком
        long startTime = System.currentTimeMillis();
        Date now = new Date(startTime);
        System.out.println(this.getName() + ": New Thread is running..." + "\ntimestamp: " + now);
        try {
            Thread.sleep(timeOut);
            Date after = new Date();
            System.out.println(this.getName() + " task executed!" + "\ntimestamp: " + after);
        } catch (InterruptedException e) {
            logger.error(e);
        }
    }
}
