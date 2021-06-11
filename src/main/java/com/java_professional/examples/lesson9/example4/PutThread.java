package com.java_professional.examples.lesson9.example4;

import java.util.concurrent.Exchanger;

class PutThread implements Runnable {

    Exchanger<String> exchanger;
    String message;

    PutThread(Exchanger<String> exchanger, String message) {
        this.exchanger = exchanger;
        this.message = message;
    }

    public void run() {

        try {
            message = exchanger.exchange(message);
            //some code...
            System.out.println(Thread.currentThread().getName() + " :" + message);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
