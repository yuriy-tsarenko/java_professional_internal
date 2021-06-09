package com.java_professional.examples.lesson8.example2;

public class MainRunnable {
    public static void main(String[] args) {
        Task task = new Task();
        Thread firstThread = new Thread(task);
        Thread secondThread = new Thread(task);

        firstThread.start();
        secondThread.start();
    }
}
