package com.java_professional.examples.lesson10.example2.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Сергей", 30, false));
        persons.add(new Person("Сергей", 30, false));
        persons.add(new Person("Андрей", 14, false));
        persons.add(new Person("Александр", 28, false));
        persons.add(new Person("Анна", 8, false));
        persons.add(new Person("Евгений", 25, false));

        // Для каждого элемента коллекции persons вызвать println
        // Также указываем фильтрацию, выводить людей, у кого возраст больше 18
        // А также при помощи interface Comparator, сортировать коллекцию по имени

        List<Person> personList = persons.stream()
                .filter(person -> person.getAge() > 18)
                .distinct()
                .peek(person -> person.setHasAccess(true)) // меняет флаг, добавляет дубликат
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("-------------------------ORIGINAL----------------------------");
        persons.forEach(person -> System.out.println(person));
        System.out.println("-------------------------ORIGINAL----------------------------\n");

        System.out.println("-------------------------RESULT----------------------------");
        personList.forEach(person -> System.out.println(person));
        System.out.println("-------------------------RESULT----------------------------\n\n");

        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println("------------------------------------------------------");
        persons.stream().forEach(
                (Person p) -> {
                    System.out.println(p);
                }
        );
        System.out.println("------------------------------------------------------");
    }
}
