package com.java_professional.examples.lesson8.example1;

public class MainTwoThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo thread = new ThreadDemo(17_000);
        ThreadDemo threadDemo = new ThreadDemo(15_000);

        thread.setName("demo_thread-0");
        threadDemo.setName("demo_thread-1");

        thread.start();
        threadDemo.start();

        System.out.println("main thread finished");
    }
}
