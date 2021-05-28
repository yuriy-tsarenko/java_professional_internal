package com.java_proffesional.ruslan.homework.lesson2.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;


/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework2 task4
 * Программа определяет, какая семья (фамилия) живёт в городе:
 * Пример ввода данных:
 * Москва=Ивановы
 * Киев=Петровы
 * Лондон=Абрамовичи
 * Пример ввода для теста приложения:
 * Лондон
 * Пример вывода:
 * Абрамовичи
 */

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите город с новой строки и фамилию с новой строки!");
        LinkedHashMap<String, String> sityAndpeople = new LinkedHashMap<>();
        while (true) {
            String sity = bufferedReader.readLine();
            if (sity.isEmpty()) {
                break;
            }

            String people = bufferedReader.readLine();
            if (people.isEmpty()) {
                break;
            }

            sityAndpeople.put(sity, people);
        }

        System.out.println(sityAndpeople);

        System.out.println("Введите город:");
        String sityfind = bufferedReader.readLine();
        String exists = (sityAndpeople.containsKey(sityfind)) ? "Фамилия найдена: " : "Фамилия не найдена! ";
        System.out.println(exists);
        System.out.println(sityAndpeople.get(sityfind));
    }
}







