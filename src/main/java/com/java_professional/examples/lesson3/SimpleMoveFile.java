package com.java_professional.examples.lesson3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

public class SimpleMoveFile {
    public static void main(String[] args) {
        URL resource = SimpleCopyFile.class.getClassLoader().getResource("duke.png");
        if (resource != null) {
            String path = resource.getFile();
            File sourceFile = new File(path);
            File targetFile = new File("D:\\duke.png");

            try {
                Files.move(sourceFile.toPath(), targetFile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
