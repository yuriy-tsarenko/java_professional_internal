package com.java_professional.examples.lesson1.final_example;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductService {
    public static void main(String[] args) {
        List<ProductDto> list = new LinkedList<>();
        list.add(new ProductDto(10, 75));
        list.add(new ProductDto(10, 80));
        list.add(new ProductDto(15, 100));
        list.add(new ProductDto(5, 150));
        list.add(new ProductDto(3, 150));
        list.add(new ProductDto(6, 150));

        System.out.println(list);

        Collections.sort(list, new SortProductsByTotalAmountReverse());

        System.out.println(list);


        list.sort(new SortProductsByTotalAmount());

        System.out.println(list);

        list.sort(new SortProductsByTotalAmountTwoFields());

        System.out.println(list);
    }


    static class SortProductsByTotalAmount implements Comparator<ProductDto> {
        @Override
        public int compare(ProductDto productDto, ProductDto productDto2) {
            return productDto.getTotalAmount().compareTo(productDto2.getTotalAmount());
        }
    }

    static class SortProductsByTotalAmountReverse implements Comparator<ProductDto> {
        @Override
        public int compare(ProductDto productDto, ProductDto productDto2) {
            return productDto2.getTotalAmount().compareTo(productDto.getTotalAmount());
        }
    }

    static class SortProductsByTotalAmountTwoFields implements Comparator<ProductDto> {
        @Override
        public int compare(ProductDto productDto, ProductDto productDto2) {
            if (productDto.getTotalAmount() > productDto2.getTotalAmount()) {
                return 1;
            } else if (productDto.getTotalAmount() < productDto2.getTotalAmount()) {
                return -1;
            } else {
                if (productDto.getPrice() > productDto2.getPrice()) {
                    return 1;
                } else if (productDto.getPrice() < productDto2.getPrice()) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
