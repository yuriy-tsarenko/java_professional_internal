package com.java_proffesional.ruslan.homework.lesson5.addtask;

import java.lang.reflect.Field;

/**
 * @author Ruslan
 * Homework5 addtask
 * Создайте 2 класса, Animal и Cat. В классе Animal инициализируйте 3 поля различных модификаторов.
 * В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого из полей
 */

public class Cat {

    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();

        Field fields = animal.getClass().getDeclaredField("petName");
        fields.setAccessible(true);
        fields.set(animal, "Modifyded");
        System.out.println("Поле private: " + fields.getName() + " новое значение: " + animal.getPetName());

        fields = animal.getClass().getDeclaredField("petAge");
        fields.setAccessible(true);
        fields.setInt(animal, 777);
        System.out.println("Поле protected: "  + fields.getName() + " новое значение: " + animal.getPetAge());

        fields = animal.getClass().getDeclaredField("tail");
        fields.setAccessible(true);
        fields.setBoolean(animal, false);
        System.out.println("Поле public: " + fields.getName() + " новое значение: " + animal.isTail());


    }
}



