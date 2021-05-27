package com.java_proffesional.ruslan.homework.lesson2.task5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework2 task 5
 * Собственная Hashtable. Реализовать методы замещения, удаления в собственном классе SimpleHashtable
 * дополняя предыдущее задание
 */


public class SimpleHashtable {
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

        System.out.println("Введите новую фамилию:");
        String newpeople = bufferedReader.readLine();
        sityAndpeople.replace(sityfind, newpeople);


        System.out.println("Введите город для удаления: ");
        String deleteCity = bufferedReader.readLine();
        sityAndpeople.remove(deleteCity);

        System.out.println("Измененые данные: ");
        Set<Map.Entry<String, String>> entries = sityAndpeople.entrySet();
        entries.forEach(entry -> System.out.println("Город: " + entry.getKey() + " Фамилия: " + entry.getValue()));

    }
}


