package com.java_professional.examples.lesson1.javaProfessional.ex_003_sorting.sorting_objects;

import lombok.ToString;

@ToString
public class Animal implements Comparable<Animal> {
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
    public int compareTo(Animal other) {

        if (!this.breed.equals(other.breed)) {
            return this.breed.compareTo(other.breed);
        }

        if (this.weight != other.weight) {
            return this.weight - other.weight;
        }

        return this.price - other.price;
    }
}