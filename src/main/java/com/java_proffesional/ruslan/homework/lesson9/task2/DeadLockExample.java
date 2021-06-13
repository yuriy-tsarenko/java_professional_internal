package com.java_proffesional.ruslan.homework.lesson9.task2;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Ruslan
 * Homework9 task2
 * Создать 2 класса. Реализовать взаимную блокировку(deadlock) этих классов.
 */

public class DeadLockExample {

    private static final  String task1 = "tail";
    private static final  String task2 = "dog";

    public static void main(String[] args) {
        ExecutorService myThread = Executors.newCachedThreadPool();
        myThread.execute(new LockedResourceOne());
        myThread.execute(new LockedResourceTwo());
        myThread.shutdown();

    }

     static class LockedResourceOne implements Runnable {
        @SneakyThrows
        public void run() {
                synchronized (task1) {
                    System.out.println("dog awaiting " + task1);
                    Thread.sleep(1000);
                synchronized (task2) {
                    System.out.println("dog awaiting " + task2);
                }
            }
        }
    }

    static class LockedResourceTwo implements Runnable {
        @SneakyThrows
        public void run() {
                synchronized (task2) {
                    System.out.println("tail awaiting " + task2);
                    Thread.sleep(1000);
                synchronized (task1) {
                    System.out.println("tail awaiting " + task1);
                }
            }
        }
    }
}