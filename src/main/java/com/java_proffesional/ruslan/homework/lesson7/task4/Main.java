package com.java_proffesional.ruslan.homework.lesson7.task4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java_proffesional.ruslan.homework.lesson7.task4.dto.Response;
import lombok.SneakyThrows;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Ruslan
 * Homework7 task4
 * Создать класс Products c соответствующими полями и  используя любой из рассматриваемых ранее
 * парсеров для json преобразовать в java объекты
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().serializeNulls().create();
        Path path = Paths.get("task4.json").toAbsolutePath();
        FileInputStream inputStream = new FileInputStream(path.toString());
        byte[] bytes = inputStream.readAllBytes();
        String json = new String(bytes);
        System.out.println(json);
        Response response = gson.fromJson(json, Response.class);
        System.out.println(response);
    }
}