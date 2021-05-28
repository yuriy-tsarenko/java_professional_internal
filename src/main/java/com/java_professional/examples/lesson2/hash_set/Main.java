package com.java_professional.examples.lesson2.hash_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> planets = new HashSet<>();

// добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Venus");

// отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

// получение True если значение есть в множестве, иначе False
        boolean isExist = planets.contains("Earth");

// пустое множество?
        boolean isEmpty = planets.isEmpty();

// удаление элемента по значению
        planets.remove("Saturn");

// удалить все элементы
        planets.clear();

// размер множества
        int amount = planets.size();

// перебор элементов множества
        for (String str : planets) {
            System.out.println(str);
        }

// конвертирование HashSet в ArrayList
        List<String> list = new ArrayList<>(planets);

// конвертирование List в Set

// конвертирование List в Set, если надо учитывать сравнение элементов
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list2);
    }
}
