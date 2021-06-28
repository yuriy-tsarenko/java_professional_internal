package com.java_proffesional.ruslan.homework.lesson5.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Ruslan
 * Homework5 task2
 * Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает,
 * какой именно класс интересует.
 */

public class Start {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите имя класса (Device, Monitor, EthernetAdapter): ");
        String className = reader.readLine();
        analyzeClass(className);
    }

    private static void analyzeClass(String className) {

        String path = "com.java_proffesional.ruslan.homework.lesson5.task2.";

        try {
            Class<?> clazz = Class.forName(path + className);

            String colorTwo = (char) 27 + "[35m";
            String colorThree = (char) 27 + "[34m";
            String colorFour = (char) 27 + "[36m";

            System.out.println(colorTwo + "Родительский класс: " + clazz.getSuperclass());
            System.out.println(colorThree + "Имя класса: " + clazz);
            System.out.println(colorFour + "Поля класса: " + Arrays.toString(clazz.getDeclaredFields()));
            System.out.println(colorTwo + "Методы класса: " + Arrays.toString(clazz.getDeclaredMethods()));
            System.out.println(colorThree + "Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));

        } catch (ClassNotFoundException e) {
            System.out.println("Неизвестный класс: " + className);
        }

    }
}