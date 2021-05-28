package com.java_professional.examples.lesson3.buffered;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        try (FileOutputStream outputStream = new FileOutputStream("абсолютный путь\\MainCopy.java");
             FileInputStream fileInputStream = new FileInputStream("абсолютный путь\\\\Main.java");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream))) {

            int c;
            while ((c = bufferedReader.read()) != -1) {
                bufferedWriter.write((char) c);
            }
            bufferedWriter.flush();
            System.out.println("The job's finished.");
        } catch (Exception e) {
            log.error(e);
        }
    }
}