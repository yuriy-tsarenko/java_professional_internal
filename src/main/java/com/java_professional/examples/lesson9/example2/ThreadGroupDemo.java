package com.java_professional.examples.lesson9.example2;

public class ThreadGroupDemo implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();

        ThreadGroup threadGroup = new ThreadGroup("Parent ThreadGroup");

        Thread firstThread = new Thread(threadGroup, runnable, "one");
        firstThread.start();
        Thread secondThread = new Thread(threadGroup, runnable, "two");
        secondThread.start();
        Thread thirdThread = new Thread(threadGroup, runnable, "three");
        thirdThread.start();

        System.out.println("Thread Group Name: " + threadGroup.getName());
        threadGroup.list();
        threadGroup.setDaemon(true);

    }
}

