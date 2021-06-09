package com.java_proffesional.ruslan.homework.lesson7.task2;

import lombok.ToString;

/**
 * @author Ruslan
 * Homework7 task2
 * Создать класс Bird. Создать 3 поля, методы, конструктор. Клонировать объект используя клонирование
 * через метод clone()
 */

@ToString

public class CloneTest {
    public static void main(String[] args) {

        AnimaL animaL = new AnimaL(true);
        Bird birds = new Bird("Colibri", 5, "blue", animaL);

        try {
            Bird cloneBird = birds.clone();
            System.out.println(birds);
            System.out.println(cloneBird);

            cloneBird.name = "Colibri";
            cloneBird.age = 5;
            cloneBird.color = "blue";

            System.out.printf("%35s%n","AFTER CLONING");

            System.out.println(birds);
            System.out.println(cloneBird);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}