package com.java_proffesional.ruslan.homework.lesson9.task3;


import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.identityHashCode;

/**
 * @author Ruslan
 * Homework9 task3
 * Изменить задание №2. Всеми возможными способами (которые Вы знаете) решить проблему взаимной блокировки.
 */

public class DeadUnlockExample {

    private static final String task1 = "tail";
    private static final String task2 = "dog";

    public static void main(String[] args) {
        ExecutorService myThread = Executors.newCachedThreadPool();
        myThread.execute(new DeadUnlockExample.LockedResourceOne());
        myThread.execute(new DeadUnlockExample.LockedResourceTwo());
        myThread.shutdown();
    }

    static class LockedResourceOne implements Runnable {
        @SneakyThrows
        public void run() {
            if (identityHashCode(task1) >= identityHashCode(task2)) {
                synchronized (task1) {
                    System.out.println("dog awaiting " + task1);
                    Thread.sleep(1000);
                }
            } else {
                synchronized (task2) {
                    System.out.println("dog awaiting " + task2);
                }
            }
        }
    }

    static class LockedResourceTwo implements Runnable {
        @SneakyThrows
        public void run() {
            if (identityHashCode(task2) >= identityHashCode(task1)) {
                synchronized (task2) {
                    System.out.println("tail awaiting " + task2);
                    Thread.sleep(1000);
                }
            } else {
                synchronized (task1) {
                    System.out.println("tail awaiting " + task1);
                }
            }
        }
    }
}
