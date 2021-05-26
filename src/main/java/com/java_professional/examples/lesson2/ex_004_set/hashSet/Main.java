package com.java_professional.examples.lesson2.ex_004_set.hashSet;

import com.java_professional.examples.lesson2.ex_004_set.Bike;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем коллекцию хэш-сет
        Set<Bike> set = new HashSet<>();
        Bike bike = new Bike();
        bike.setBrand("Brand");
        bike.setSpeed(200);
        bike.setMaxDistance(400);
        Bike bike2 = new Bike("Brand", 200, 400);
        set.add(bike);
        set.add(bike2);

        System.out.println(set);
    }
}
