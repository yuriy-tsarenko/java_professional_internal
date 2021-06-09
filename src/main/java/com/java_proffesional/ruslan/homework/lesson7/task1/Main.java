package com.java_proffesional.ruslan.homework.lesson7.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Ruslan
 * Homework7 task1
 * Создайте класс Car. Опишите в нем 3 различных поля включая статические поля, создайте конструктор, методы.
 * Посредством Java создайте файл и выполните сериализацию объекта Car используя интерфейс Serializable
 */

public class Main {
    public static void main(String[] args) {
        // Create an object of class file and specify the file
        File file = new File("task1.txt");
        Car car = new Car("Audi", "Red", 14000);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            //  Serialize the Car object into byte code
            outputStream.writeObject(car);

            // Deserialize the Car object from bytecode
            Car newCar = (Car) ois.readObject();
            System.out.println(newCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
