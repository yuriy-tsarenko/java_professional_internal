package com.java_proffesional.ruslan.homework.lesson7.task1;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Ruslan
 * Homework7 task1
 * Создайте класс Car. Опишите в нем 3 различных поля включая статические поля, создайте конструктор, методы.
 * Посредством Java создайте файл и выполните сериализацию объекта Car используя интерфейс Serializable
 */

@NoArgsConstructor
@ToString

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * car's name
     * car's tures
     * car's color
     * car's price
     */
    private static int tures = 4; //is not serialized
    private String name;
    private String color;
    private int price;

    /**
     * This constructor initializes a Car object.
     *
     * @param name  an initial car name
     * @param color an initial car color
     * @param price an initial car price
     */
    Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    /**
     * Method call gets the car's tures
     *
     * @return car's tures
     */
    public static int getTures() {
        return tures;
    }

    /**
     * Method call sets a tures of a car
     *
     * @param tures a new car tures
     */
    public static void setTures(int tures) {
        Car.tures = tures;
    }

    /**
     * Method call gets the car's name
     *
     * @return car's name
     */
    public String getName() {
        return name;
    }

    /**
     * Method call sets a name of a car
     *
     * @param name a new car name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method call gets the car's color
     *
     * @return car's color
     */
    public String getColor() {
        return color;
    }

    /**
     * Method call sets a color of a car
     *
     * @param color a new car color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Method call gets the car's price
     *
     * @return car's price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Method call sets a price of a car
     *
     * @param price a new car price
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
