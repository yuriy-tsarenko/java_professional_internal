package com.java_professional.examples.lesson3.readingFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создали объект файла по ссылке
        File file = new File("D:\\IT\\IdeaProjects\\java_profesional_internal\\src\\main\\java\\com\\"
                + "java_professional\\examples\\lesson3\\readingFile\\example.txt");

        // Считываем текстовый файл в пакете
        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println("Good Luck");
        pw.flush();
        pw.close();
    }
}
