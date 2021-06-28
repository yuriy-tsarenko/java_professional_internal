package com.java_proffesional.ruslan.homework.lesson5.task2;


/**
 * @author Ruslan
 * Homework5 task2
 * Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает,
 * какой именно класс интересует.
 */

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;


   public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}

