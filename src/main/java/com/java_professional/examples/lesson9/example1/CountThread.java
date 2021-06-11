package com.java_professional.examples.lesson9.example1;

import java.util.concurrent.Semaphore;

class CountThread implements Runnable {

    private final CommonResource commonResource;
    private final Semaphore semaphore;

    CountThread(CommonResource commonResource, Semaphore semaphore) {
        this.commonResource = commonResource;
        this.semaphore = semaphore;
    }

    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " ожидает разрешение");
            semaphore.acquire();
            Thread.sleep(5_000);
            System.out.println(Thread.currentThread().getName() + " разрешение получил");
            commonResource.setResource(1);
            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " работает");
                commonResource.setResource(i);
                Thread.sleep(5_000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " освобождает разрешение");
        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " завершил работу");
    }
}
