package com.java_professional.examples.lesson1.javaProfessional.ex_005_comparator.interface_comparator_with_objects;

import java.util.Comparator;

public class Animal {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    static class ComparatorByPrice implements Comparator<Animal> {
        public int compare(Animal o1, Animal o2) {
            return o1.price - o2.price;
        }
    }

    static class ComparatorBySpeed implements Comparator<Animal> {
        public int compare(Animal o1, Animal o2) {
            return o1.speed - o2.speed;
        }
    }

    static class ComparatorByBreed implements Comparator<Animal> {
        public int compare(Animal o1, Animal o2) {
            return o1.breed.compareTo(o2.breed);
        }
    }
}