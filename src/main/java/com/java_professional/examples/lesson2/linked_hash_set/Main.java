package com.java_professional.examples.lesson2.linked_hash_set;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> planets = new LinkedHashSet<>();

// добавление элементов
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Neptune");

// отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);
    }
}
