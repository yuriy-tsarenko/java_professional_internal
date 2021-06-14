package com.java_professional.examples.lesson10.simple.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(10, -20, 30, 40, 30)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        Stream<Integer> stream = Stream.of(10, 20, 30);

        String[] arr = {"Yevhenii", "Karyna", "Marsel"};

        Stream<String> stream1 = Arrays.stream(arr);

        Stream<Object> build = Stream.builder()
                .add(10)
                .add(20)
                .add(30)
                .build();

        IntStream chars = "Hello".chars();
        /*
            конвеерные:
                map, filter, distinct, parallel, sequential, flatMap, skip, limit

            терминальные:
                forEach, collect, min/max/sum/count, matcher(anyMatch, allMatch),
                findFirst, findAny, iterator
         */
    }
}
