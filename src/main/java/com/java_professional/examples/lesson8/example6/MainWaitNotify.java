package com.java_professional.examples.lesson8.example6;

public class MainWaitNotify {

    public static void main(String[] args) {
        Store store = new Store();
        Plant plant = new Plant(store);
        Consumer consumer = new Consumer(store);
        new Thread(plant, "PLANT").start();
        new Thread(consumer, "CONSUMER").start();
    }
}
