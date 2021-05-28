package com.java_professional.examples.lesson3.ex_003_ioStream.io;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        // пишем в файл
        try (OutputStream outputStream = new FileOutputStream("D:\\IT\\IdeaProjects\\java_profesional_internal\\"
                + "src\\main\\java\\com\\java_professional\\examples\\lesson3\\ex_003_ioStream\\test.txt")) {
            byte[] bytes = {11, 21, 3, 40, 56, 77, 1};

            for (int x = 0; x < bytes.length; x++) {
                outputStream.write(bytes[x]); // writes the bytes
            }
            outputStream.flush();

            //читаем файл
            inputStream = new FileInputStream("D:\\IT\\IdeaProjects\\java_profesional_internal\\"
                    + "src\\main\\java\\com\\java_professional\\examples\\lesson3\\ex_003_ioStream\\test.txt");
            int size = inputStream.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) inputStream.read() + "  ");
            }
        } catch (IOException e) {
            log.error(e);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}

