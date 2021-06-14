package com.java_professional.examples.lesson10.stream.example3;


import com.java_professional.examples.lesson10.stream.example1.Product;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // max() method to get max Product price
        Product productA = productsList.stream()
                .max((product1, product2) ->
                        product1.getPrice() > product2.getPrice() ? 1 : -1).get();

        System.out.println(productA.getPrice());
        // min() method to get min Product price
        Product productB = productsList.stream()
                .min((product1, product2) ->
                        product1.getPrice() < product2.getPrice() ? 1 : -1).get();
        System.out.println(productB.getPrice());

        // .count()
        long count = productsList.stream()
                .filter(product -> product.getPrice() < 30000)
                .count();

        System.out.println(count);


        Product productTest = productsList.stream()
                .max((accumulator, product) -> {
                    System.out.println(accumulator);
                    System.out.println(product);
                    System.out.println("___________________________");
                    System.out.println("price1: " + accumulator.getPrice());
                    System.out.println("price2: " + product.getPrice());
                    return accumulator.getPrice() > product.getPrice() ? 1 : -1;
                }).get();

        System.out.println(productTest);
    }


}


