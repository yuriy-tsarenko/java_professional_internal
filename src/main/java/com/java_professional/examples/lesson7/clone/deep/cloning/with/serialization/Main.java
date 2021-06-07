package com.java_professional.examples.lesson7.clone.deep.cloning.with.serialization;

import org.apache.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Cow cow = new Cow("COW", 200, 5);

        //создаем буфер вместо файла как в прошлых примерах
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();

        //сериализуем
        try (ObjectOutputStream output = new ObjectOutputStream(byteOutput)) {
            //пишем в буфер
            output.writeObject(cow);
            //сериализованный обьект
            byte[] buffer = byteOutput.toByteArray();
            System.out.println(Arrays.toString(buffer));
        } catch (IOException e) {
            log.error(e);
        }

        //десериализуем
        try (ByteArrayInputStream byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
             ObjectInputStream input = new ObjectInputStream(byteInput)) {
            Cow cloneBurenka = (Cow) input.readObject();
            System.out.println(cow);
            System.out.println(cloneBurenka);
            cloneBurenka.setWeight(500);
            System.out.println("----------------------------");
            System.out.println(cow);
            System.out.println(cloneBurenka);
        } catch (IOException | ClassNotFoundException e) {
            log.error(e);
            e.printStackTrace();
        }
    }
}
