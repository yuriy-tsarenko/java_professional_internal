package com.java_professional.examples.lesson7.serialization.serialization1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File file = new File("D:\\IT\\IdeaProjects\\java_profesional_internal\\src\\main\\java\\com\\"
                + "java_professional\\examples\\lesson7\\serialization\\serialization1\\bmw.db");
        Car bmw = new Car(50000, "Bmw", "John Western");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            // Сериализуем объект Bmw в байт-код
            outputStream.writeObject(bmw);
            // Десериализуем объект Car с байт-кода
            Car car = (Car) inputStream.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
