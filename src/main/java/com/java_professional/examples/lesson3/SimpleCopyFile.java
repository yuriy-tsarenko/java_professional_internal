package com.java_professional.examples.lesson3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

public class SimpleCopyFile {
    public static void main(String[] args) {
        URL resource = SimpleCopyFile.class.getClassLoader().getResource("duke.png");
        if (resource != null) {
            String path = resource.getFile();
            String copyPath = path.replace("duke.png", "duke2.png");
            File sourceFile = new File(path);
            File targetFile = new File(copyPath);

            try {
                if (!targetFile.exists()) {
                    Files.copy(sourceFile.toPath(), targetFile.toPath());
                } else {
                    System.out.println("target file exists!!!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
