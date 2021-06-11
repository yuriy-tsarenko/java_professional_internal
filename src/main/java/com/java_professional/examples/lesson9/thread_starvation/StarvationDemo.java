package com.java_professional.examples.lesson9.thread_starvation;

//Если вы используете wait-notify извещение, то теоретически поток, ожидающий доступа к общему ресурсу,
// может ждать бесконечно долго, если всегда уведомляется какой-либо другой поток
// или не уведомляется какой-то конкретный поток.
public class StarvationDemo {

    public static void main(String[] args) {
        Store store = new Store();
        Plant plant = new Plant(store);
        Consumer consumer = new Consumer(store);
        new Thread(plant, "PLANT").start();
        new Thread(consumer, "CONSUMER").start();
    }
}
