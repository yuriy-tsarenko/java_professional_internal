package com.java_professional.examples.lesson2.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> planets = new LinkedHashMap<>();

// добавление элементов
        planets.put("Mercury", 2439.7);
        planets.put("Earth", 6371.0);
        planets.put("Saturn", 58232.0);
        planets.put("Neptune", 24622.0);
        planets.put("Venus", 6051.8);

// отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

// получить значение по ключу
        Double radius = planets.get("Earth");

// получение True если ключ есть в отображении, иначе False
        boolean isExist = planets.containsKey("Earth");


// перебор элементов отображения с помощью for
        Set<Map.Entry<String, Double>> entries = planets.entrySet();
        entries.forEach(entry -> System.out.println("Key: " + entry.getKey() + " & Value: " + entry.getValue()));

// еще один вариант перебора элементов отображения с помощью for
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Key: " + key + " & Value: " + value);
        }
    }
}
