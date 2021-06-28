package com.java_professional.examples.lesson9.dead_lock;

import lombok.SneakyThrows;

//Если объект X обладает synchronized-методом, который вызывает synchronized-метод
//объекта Y, a Y, в свою очередь, также имеет синхронизированный метод,
//обращающийся к synchronized-методу объекта X, два потока могут находиться в
//состоянии ожидания взаимного завершения, чтобы овладеть блокировкой, и ни один
//из них не окажется способен продолжить работу.
public class DeadLockDemo {
    public static void main(String[] args) {
        LockedResource lockedResource = new LockedResource();
        LockedResourceTwo lockedResourceTwo = new LockedResourceTwo();

        Runnable job = new Runnable() {
            @Override
            public void run() {
                lockedResource.lockedResourceMethod(lockedResourceTwo);
            }
        };

        Runnable jobTwo = new Runnable() {
            @Override
            public void run() {
                lockedResourceTwo.lockedResourceMethodTwo(lockedResource);
            }
        };

        Thread threadOne = new Thread(job, "dead-thread-1");
        Thread threadTwo = new Thread(jobTwo, "dead-thread-2");

        threadOne.start();
        threadTwo.start();
    }
}
