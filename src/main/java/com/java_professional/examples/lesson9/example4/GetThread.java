package com.java_professional.examples.lesson9.example4;

import java.util.concurrent.Exchanger;

class GetThread implements Runnable {

    Exchanger<String> exchanger;
    String message;

    GetThread(Exchanger<String> exchanger, String message) {
        this.exchanger = exchanger;
        this.message = message;
    }

    public void run() {

        try {
            //some code...
            message = exchanger.exchange(message);
            System.out.println(Thread.currentThread().getName() + " :" + message);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
