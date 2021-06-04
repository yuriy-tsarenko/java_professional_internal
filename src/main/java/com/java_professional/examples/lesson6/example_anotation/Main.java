package com.java_professional.examples.lesson6.example_anotation;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        CsvParser<UserDto> parser = new CsvParser<>();
        try {
            List<UserDto> parse = parser.parse("example.csv", UserDto.class, ";");
            parse.forEach(System.out::println);
        } catch (NoSuchMethodException | InvocationTargetException
                | InstantiationException | IllegalAccessException e) {
            log.error(e);
        }
    }
}
