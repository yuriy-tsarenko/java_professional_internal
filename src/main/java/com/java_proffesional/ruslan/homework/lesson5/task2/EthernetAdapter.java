package com.java_proffesional.ruslan.homework.lesson5.task2;


/**
 * @author Ruslan
 * Homework5 task2
 * Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает,
 * какой именно класс интересует.
 */

public class EthernetAdapter {
        private int speed;
        private String mac;

    public     EthernetAdapter(int speed, String mac) {
            this.speed = speed;
            this.mac = mac;
        }

        public int getSpeed() {
            return speed;
        }

        public String getMac() {
            return mac;
        }

    @Override
    public String toString() {
        return "EthernetAdapter{"
                + "speed=" + speed
                + ", mac='" + mac
                + '\'' + '}';
    }
}