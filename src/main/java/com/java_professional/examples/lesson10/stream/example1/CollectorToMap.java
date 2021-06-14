package com.java_professional.examples.lesson10.stream.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorToMap {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        Map<Integer, String> collect = productsList.stream()
                .collect(Collectors.toMap((k) -> k.getId(), (v) -> v.getName()));

        collect.entrySet().stream()
                .forEach(System.out::println);
    }
}
