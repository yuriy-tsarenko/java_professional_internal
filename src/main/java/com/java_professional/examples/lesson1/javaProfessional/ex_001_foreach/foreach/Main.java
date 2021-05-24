package com.java_professional.examples.lesson1.javaProfessional.ex_001_foreach.foreach;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphynx", 4000);
        Animal dog = new Animal("Malamute", 3000);
        Animal bird = new Animal("Crow", 2000);

        Animal[] animals = {cat, dog, bird};

        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal("Lion", 200000);
        }

        for (Animal item : animals) {
            item.price = item.price + 1000;    // Возможно изменение полей объекта
            item = new Animal("Lion", 200000);     // Нельзя поменять объекты в массиве
        }

        for (Animal tmp : animals) {
            System.out.println(tmp.breed + " " + tmp.price);
        }
    }
}
