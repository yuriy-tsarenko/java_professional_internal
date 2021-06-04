package com.java_professional.examples.lesson6.example_anotation;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvParser<T> {

    private String getContent(String filePath) {
        StringBuilder builder = new StringBuilder();
        InputStream inputStream = CsvParser.class.getClassLoader().getResourceAsStream(filePath);
        if (inputStream != null) {
            Scanner reader = new Scanner(inputStream);
            while (reader.hasNext()) {
                builder.append(reader.nextLine());
                builder.append("\n");
            }
            return builder.toString();
        } else {
            throw new RuntimeException("resource not found");
        }
    }

    public List<T> parse(String filePath, Class<T> type, String separator) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String content = getContent(filePath);
        String[] lines = getLines(content);
        List<T> list = new ArrayList<>();
        Field[] declaredFields = type.getDeclaredFields();
        for (String line : lines) {
            T newInstance = type.getConstructor().newInstance();
            T object = buildObject(declaredFields, newInstance, line, separator);
            list.add(object);
        }
        return list;
    }

    private T buildObject(Field[] declaredFields, T newInstance, String line, String separator) throws IllegalAccessException {
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(CsvField.class)) {
                field.setAccessible(true);
                field.set(newInstance, getValue(line, field, separator));
            }
        }
        return newInstance;
    }

    private String getValue(String line, Field field, String separator) {
        String[] keyValues = line.split(separator);
        for (int k = 0, v = 1; v < keyValues.length; k++, v++) {
            CsvField csvField = field.getAnnotation(CsvField.class);
            if (keyValues[k].equals(csvField.name())) {
                return keyValues[v];
            }
        }
        return null;
    }

    private String[] getLines(String content) {
        return content.split("\n");
    }

}
