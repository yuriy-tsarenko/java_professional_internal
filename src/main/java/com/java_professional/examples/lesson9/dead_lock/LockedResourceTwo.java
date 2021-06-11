package com.java_professional.examples.lesson9.dead_lock;

public class LockedResourceTwo {

    public synchronized void lockedResourceMethodTwo(LockedResource resource) {
        System.out.println(Thread.currentThread().getName() + " waiting for monitor...");
        resource.lockedResourceMethod(this);
    }
}
