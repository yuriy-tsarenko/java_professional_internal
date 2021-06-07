package com.java_professional.examples.lesson7.json.ex_002_gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java_professional.examples.lesson7.json.ex_002_gson.dto.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().serializeNulls().create();
        Path path = Paths.get("test.json").toAbsolutePath();
        FileInputStream inputStream = new FileInputStream(path.toString());
        byte[] bytes = inputStream.readAllBytes();
        String json = new String(bytes);
        System.out.println(json);
        Response response = gson.fromJson(json, Response.class);
        System.out.println(response);
    }
}
