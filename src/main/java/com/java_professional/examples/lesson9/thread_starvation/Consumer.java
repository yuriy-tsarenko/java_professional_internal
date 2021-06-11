package com.java_professional.examples.lesson9.thread_starvation;

// Класс Потребитель
public class Consumer implements Runnable {

    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 100; i++) {
            store.get();
        }
    }
}
