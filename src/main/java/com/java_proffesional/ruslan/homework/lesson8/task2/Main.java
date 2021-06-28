package com.java_proffesional.ruslan.homework.lesson8.task2;


import lombok.SneakyThrows;

/**
 * @author Ruslan
 * Homework8 task2
 * Необходимо создать 3 потока, каждых из этих потоков запустить (например: main, second, first), и когда эти потоки
 * успешно отработают – вывести на экран сообщение о завершении работы каждого потока отдельно.
 * В первом варианте сделать выполнение параллельное, и создать еще вариант последовательного выполнения задач
 * потоками с помощью метода join()
 */

public class Main {
    public static void main(String[] args) {

        Runnable job = new Runnable() {
            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            @SneakyThrows
            @Override
            public void run() {
                System.out.println(" Start of: " + Thread.currentThread().getName());
                String anim = " |/-\\ ";
                for (int x = 0; x < 100; x++) {
                    String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
                    System.out.write(data.getBytes());
                    Thread.sleep(75);
                }
                System.out.println(" Task finished: " + Thread.currentThread().getName());
            }
        };

        Thread firstThread = new Thread(job, "first");
        Thread secondThread = new Thread(job, "second");
        Thread mainThread = new Thread(job, "main");
        try {
            mainThread.start();
            mainThread.join();//the rest of the threads are waiting
            firstThread.start(); //the first and second threads run in parallel
            secondThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}





