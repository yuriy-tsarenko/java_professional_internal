package com.java_professional.examples.lesson10.example3.stream_avarage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Сергей", 30));
        persons.add(new Person("Андрей", 14));
        persons.add(new Person("Александр", 25));
        persons.add(new Person("Анна", 8));
        persons.add(new Person("Евгений", 23));

        int sum = 0;
        int adultPersons = 0;

        for (Person p : persons) {
            if (p.getAge() >= 18) {
                sum += p.getAge();
                adultPersons++;
            }
        }

        double averageAge = (double) sum / adultPersons;

        System.out.println(averageAge);
        // ================================
        // Надо отфильтровать, используя данное условие, надо преобразовать набор объектов person в интовое значение
        double average2 = 0;
        try {
            average2 = persons.stream()
                    .filter(p -> p.getAge() >= 18)
                    .mapToInt(p -> p.getAge())
                    .average()
                    .orElseThrow(() -> new Exception(""));
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(average2);
        // ================================

    }
}
