package com.java_proffesional.ruslan.homework.lesson2.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework2 task2
 * Используя коллекцию удвойте слово: 1. Введите с клавиатуры 5 слов в список строк. 2. Метод doubleValues
 * должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c. 3. Используя цикл for выведите результат на экран,
 * каждое значение с новой строки.
 */

public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listlines = new ArrayList<>();
        System.out.println("Ведите слова с новой строки!");
        for (int i = 0; i < 5; i++) {
            try {
                listlines.add(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println("Ошибка ввода");
                e.printStackTrace();
            }
        }

       doubleValues(listlines);
        System.out.println("Удваиваем слова!)");
        for (String twolines : listlines) {
            System.out.println(twolines + ".");
        }
    }

    private static void doubleValues(ArrayList<String> linesArrayList) {
        int i = 0;
        for (String result : linesArrayList) {
            linesArrayList.set(i, result + "," + result);
            i++;
        }
    }
}
