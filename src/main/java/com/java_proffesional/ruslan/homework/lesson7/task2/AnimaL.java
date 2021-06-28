package com.java_proffesional.ruslan.homework.lesson7.task2;


import lombok.ToString;

/**
 * @author Ruslan
 * Homework7 task2
 * Создать класс Bird. Создать 3 поля, методы, конструктор. Клонировать объект используя  клонирование
 * через метод clone()
 */

@ToString

public class AnimaL implements Cloneable {

    public boolean wings;

    AnimaL(boolean wings) {
        this.wings = wings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
