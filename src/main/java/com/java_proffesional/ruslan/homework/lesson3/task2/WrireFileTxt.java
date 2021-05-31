package com.java_proffesional.ruslan.homework.lesson3.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework3 task2
 * Создайте файл, запишите в него произвольные данные и закройте файл. Затем снова откройте этот файл,
 * прочитайте из него данные и выведете их на консоль.
 */

public class WrireFileTxt {
    public static void main(String[] args) throws IOException {
        writeTextFile();
        readTexeFile();

    }

    private static void writeTextFile() throws IOException {
        try (Writer writer = new FileWriter("file.txt", false)) {
            writer.write("Hello, world!");
            writer.flush();
        }
    }

    private static void readTexeFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
        String result;
        while ((result = bufferedReader.readLine()) != null) {
            System.out.println(result);
        }
        bufferedReader.close();
    }
}