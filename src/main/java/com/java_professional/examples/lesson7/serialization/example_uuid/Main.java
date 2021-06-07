package com.java_professional.examples.lesson7.serialization.example_uuid;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\IT\\IdeaProjects\\java_profesional_internal\\src\\main\\java\\com\\"
                + "java_professional\\examples\\lesson7\\serialization\\example_uuid\\demo.txt");
        DemoDto demoDto = new DemoDto();
        demoDto.setModel("Model");
        demoDto.setPrice(50000);

        //сериализуем
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
//            // Сериализуем объект Bmw в байт-код
//            outputStream.writeObject(demoDto);
//            // Десериализуем объект Car с байт-кода
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//десериализуем
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            // Сериализуем объект Bmw в байт-код
            // Десериализуем объект Car с байт-кода
            DemoDto demoDto1 = (DemoDto) inputStream.readObject();
            System.out.println(demoDto1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
