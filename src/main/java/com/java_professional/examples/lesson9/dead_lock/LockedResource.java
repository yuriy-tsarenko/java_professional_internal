package com.java_professional.examples.lesson9.dead_lock;

public class LockedResource {

    public synchronized void lockedResourceMethod(LockedResourceTwo resourceTwo) {
        System.out.println(Thread.currentThread().getName() + " waiting for monitor...");
        resourceTwo.lockedResourceMethodTwo(this);
    }
}
