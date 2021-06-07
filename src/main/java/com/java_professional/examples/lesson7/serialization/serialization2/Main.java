package com.java_professional.examples.lesson7.serialization.serialization2;

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
                + "java_professional\\examples\\lesson7\\serialization\\serialization2\\file3.txt");
        Car car = new Car(5000, "Bmw", new Engine(1500));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // Сериализуем объект Bmw в байт-код
            outputStream.writeObject(car);

            // Десериализуем объект Bmw с байт-кода
            Car newCar = (Car) ois.readObject();
            System.out.println(newCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
