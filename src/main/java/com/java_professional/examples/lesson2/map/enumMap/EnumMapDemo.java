package com.java_professional.examples.lesson2.map.enumMap;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<>(Animal.class);
        enumMap.put(Animal.CAT, "C");
        enumMap.put(Animal.DOG, "D");
        enumMap.put(Animal.BIRD, "B");

        Set<Map.Entry<Animal, String>> entries = enumMap.entrySet();

        for (Map.Entry<Animal, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

enum Animal {
    CAT, DOG, BIRD
}
