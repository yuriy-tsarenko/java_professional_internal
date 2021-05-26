package com.java_professional.examples.lesson2.tree_set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> planets = new TreeSet<>();

// добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Venus");

// добавлене несколько элементов сразу
        planets.addAll(Arrays.asList("PlanetX", "PlanetY", "PlanetZ"));

// отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

// получение True если значение есть в множестве, иначе False
        boolean isExist = planets.contains("Earth");

// пустое множество?
        boolean isEmpty = planets.isEmpty();

// получить первый элемент
        String planet = planets.first();

// получить последний элемент
        String planet2 = planets.last();

// получить все элементы перед указаным
        Set<String> planetsBefore = planets.headSet("Neptune");

// получить все элементы после указаного
        Set<String> planetsAfter = planets.tailSet("Neptune");

// получить все элементы между двумя указаными
        Set<String> planetsSub = planets.subSet("Mercury", "Venus");

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
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Venus");

//
        int pos = planets.headSet("Neptune").size();

// определим произволный Comparator для TreeSet
        Set<Integer> planets2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // define comparing logic here
                return Integer.compare(o1, o2);
            }
        });

        planets2.add(2);
        planets2.add(3);
        planets2.add(3);
        planets2.add(5);
        planets2.add(1);

        System.out.println(planets2);
    }
}
