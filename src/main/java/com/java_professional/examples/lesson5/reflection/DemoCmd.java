package com.java_professional.examples.lesson5.reflection;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class DemoCmd {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.directory(new File("D:\\"));
        processBuilder.command("cmd.exe", "/c", "dir");
        Process process = processBuilder.start();
        InputStream inputStream = process.getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        String string = new String(bytes);
        System.out.println(string);
    }
}
