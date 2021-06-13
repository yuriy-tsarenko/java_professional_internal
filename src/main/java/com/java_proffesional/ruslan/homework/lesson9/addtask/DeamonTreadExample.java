package com.java_proffesional.ruslan.homework.lesson9.addtask;

import lombok.SneakyThrows;

/**
 * @author Ruslan
 * Homework9 addtask
 * Создайте поток-демон и выведите про него как можно больше информации.
 */

    public class DeamonTreadExample {

    @SneakyThrows
    public static void main(String[] args) {
         new JobThread(true).start();    //set it to true and false and run twice.
            Thread.sleep(7500);
        System.out.println("Main Thread ending");
    }
}
class JobThread extends Thread {
    private boolean isDeamon;
    JobThread(boolean isDeamon) {
        // When false, (i.e. when it a user thread),
        // the Worker thread continues to run.
        // When true, (i.e. when it a daemon thread),
        // the Worker thread terminates when the main
        // thread terminates.
        this.isDeamon = isDeamon;
        setDaemon(isDeamon);
    }

    @SneakyThrows
    public void run() {
        System.out.println("I am a " + (isDeamon ? "Deamon Thread" : "User Thread (none-deamon)"));
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.println("\tworking from Worker thread " + counter++);
            String nameThread =  getName(); // gets the thread name
            long idThread = getId();// returns the thread identifier
            boolean alive =  isAlive(); // the execution state of the thread
            int priority = getPriority();//gets the thread priority
            System.out.printf("имя потока: %s; идентификатор потока: %d; поток выполняется: %s; приоритет потока: %d;%n",
                    nameThread, idThread, alive, priority);
                sleep(5000);
        }
        System.out.println("\tWorker thread ends. ");
    }
}



