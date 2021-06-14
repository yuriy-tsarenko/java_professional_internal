package com.java_professional.examples.lesson10.stream.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WithoutStream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> productPriceList = new ArrayList<>();
        for (Product product : productsList) {
            // filtering data of list
            if (product.getPrice() < 30000) {
                productPriceList.add(product.getPrice());    // adding price to a productPriceList
            }
        }
        System.out.println(productPriceList);   // displaying data


        Set<Product> collect = productsList.stream()
                .filter(product -> product.getPrice() < 30000)
                .peek(product -> product.setPrice((float) (product.getPrice() * 1.2)))
                .collect(Collectors.toSet());

        System.out.println(collect);

    }

}
