package com.java_professional.examples.lesson2.navigable_set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<String> planets = new TreeSet<>();

// добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Venus");

// печать множества
        System.out.println(planets);

// обратный порядок
        NavigableSet<String> planetsReverse = planets.descendingSet();
        System.out.println(planetsReverse);

// получить два последних элемента
        NavigableSet<String> twoLast = planets.tailSet("Saturn", true);
        System.out.println(twoLast);

// получить элемент, который перед указанным
        String lower = planets.lower("Saturn");
        System.out.println(lower);

// получить элемент, который после указаного
        String higher = planets.higher("Saturn");
        System.out.println(higher);

// получить первый элемент и удалить его из множества
        String first = planets.pollFirst();

// получить последний элемент и удалить его из множества
        String last = planets.pollLast();
    }
}
