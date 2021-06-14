package com.java_professional.examples.lesson10.simple.optional;

import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.empty();
        Optional<Integer> opt2 = Optional.of(10);
        Optional<Integer> opt3 = Optional.ofNullable(null);

        Optional<List<String>> optional = Optional.ofNullable(getString());
        if (optional.isPresent()) {
            List<String> strings = optional.get();
            strings.add("ss");
            System.out.println(strings);
        } else {
            System.out.println("optional working");
        }
    }

    public static List<String> getString() {
        return null;
    }
}
