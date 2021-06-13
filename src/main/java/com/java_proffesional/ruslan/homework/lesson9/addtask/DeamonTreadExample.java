package com.java_proffesional.ruslan.homework.lesson9.addtask;

/**
 * @author
 *
 * Создайте поток-демон и выведите про него как можно больше информации.
 */
public class DeamonTreadExample {


        public static void main(String[] args) throws InterruptedException {

            Thread t = new Thread(DeamonTreadExample::run);
            t.setDaemon(true);
            t.start();

            Thread.sleep(10000);
            System.out.println("main thread exited");
        }

    private static void run() {
        int count = 0;
        while (true) {
            count++;
            try {
                System.out.println("inside try" + count);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("finally executed" + count);
            }
        }
    }
}