package com.java_professional.examples.lesson9.example2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
    }
}
