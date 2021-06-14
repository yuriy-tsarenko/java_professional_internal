package com.java_professional.examples.lesson10.stream.create_stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //Классический: Создание стрима из коллекции
        List<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();

        //Создание стрима из значений
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");

        //Создание стрима из массива
        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);

        //Создание стрима из файла (каждая строка в файле будет отдельным элементом в стриме)
        try {
            Stream<String> streamFromFiles = Files.lines(Paths.get("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Создание стрима из строки
        IntStream streamFromString = "123".chars();

        //С помощью Stream.builder
        Stream.builder()
                .add("a1")
                .add("a2")
                .add("a3")
                .build();

        //Создание параллельного стрима
        Stream<String> stream = collection.parallelStream();

        //Создание бесконечного стрима с помощью Stream.iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);

        //Создание бесконечных стрима с помощью Stream.generate
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");

        //Создание стрима из рандомными значениями
        int[] ints = new Random().ints(1000)
                .toArray();
    }
}
