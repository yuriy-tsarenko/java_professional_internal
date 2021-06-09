package com.java_proffesional.ruslan.homework.lesson7.task2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Ruslan
 * Homework7 task2
 * Создать класс Bird. Создать 3 поля, методы, конструктор. Клонировать объект используя  клонирование
 * через метод clone()
 */

@Getter
@Setter
@NoArgsConstructor

public class Bird implements Cloneable {

    public String name;
    public int age;
    public String color;
    public AnimaL animaL;

    Bird(String name, int age, String color, AnimaL animaL) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.animaL = animaL;
    }

    @Override
    public String toString() {
        return "Bird{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", color='" + color + '\''
                + ", wings=" + animaL
                + '}';
    }


    @Override
    public Bird clone() throws CloneNotSupportedException {
        Bird clone = (Bird) super.clone();
        AnimaL animaL = (AnimaL) clone.getAnimaL().clone();
        clone.setAnimaL(animaL);
        return clone;
    }

}