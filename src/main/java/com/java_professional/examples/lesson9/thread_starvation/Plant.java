package com.java_professional.examples.lesson9.thread_starvation;

// класс Производитель
public class Plant implements Runnable {

    Store store;

    Plant(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 100; i++) {
            store.put();
        }
    }
}
