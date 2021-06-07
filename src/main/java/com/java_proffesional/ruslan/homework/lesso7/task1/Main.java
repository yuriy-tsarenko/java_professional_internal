package com.java_proffesional.ruslan.homework.lesso7.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File file = new File("file.txt");
        Car car = new Car("Audi", "Red", 14000);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // Сериализуем объект Car в байт-код
            outputStream.writeObject(car);

            // Десериализуем объект Car с байт-кода
            Car newCar = (Car) ois.readObject();
            System.out.println(newCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
