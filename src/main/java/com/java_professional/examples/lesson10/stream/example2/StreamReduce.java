package com.java_professional.examples.lesson10.stream.example2;


import com.java_professional.examples.lesson10.stream.example1.Product;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenovo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // This is more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product -> product.getPrice())
                //Этот метод берет последовательность входных элементов и объединяет их в один итоговый результат
                // путем повторения операции. Например, поиск суммы чисел или накопление элементов в списке.
                .reduce(0.0f, (sum, price) -> sum + price);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product -> product.getPrice())
                .reduce(0.0f, Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);


        String summary = productsList.stream()
                .map(product -> product.getName())
                .reduce("", (first, second) -> {
                    System.out.println("first:" + first);
                    System.out.println("second: " + second);
                    String result = first + " || " + second;
                    System.out.println("result: " + result);
                    return result;
                });
        System.out.println(summary);

    }
}
