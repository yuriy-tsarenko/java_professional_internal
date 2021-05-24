package com.java_professional.examples.lesson1.final_example;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<ProductDto> set = new TreeSet<>();
        set.add(new ProductDto(20, 1000));
        set.add(new ProductDto(22, 1200));
        set.add(new ProductDto(23, 2000));
        set.add(new ProductDto(20, 1900));

        System.out.println(set);
    }
}
