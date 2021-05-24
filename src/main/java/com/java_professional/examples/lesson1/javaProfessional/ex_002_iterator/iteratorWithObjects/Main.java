package com.java_professional.examples.lesson1.javaProfessional.ex_002_iterator.iteratorWithObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Sphynx", 5000));
        animalList.add(new Animal("Malamute", 4000));

        Iterator<Animal> carIterator = animalList.iterator();

        while (carIterator.hasNext()) {
            Animal tmp = carIterator.next();
            if (tmp.breed.equals("Sphynx")) {
                tmp.price += 1000;
            }
        }
        System.out.println(animalList);
    }
}

class Animal {
    String breed;
    int price;

    Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " = " + price;
    }
}
