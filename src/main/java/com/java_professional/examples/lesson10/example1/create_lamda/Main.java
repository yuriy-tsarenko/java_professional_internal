package com.java_professional.examples.lesson10.example1.create_lamda;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        String[] name = new String[]{"John", "Victory", "Peter"};
        Workers<String> workers = new Workers<>(name);

        workers.someWork((worker) -> System.out.println(worker + " Hello from lambda"));
    }
}
