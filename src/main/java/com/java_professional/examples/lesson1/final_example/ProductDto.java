package com.java_professional.examples.lesson1.final_example;

public class ProductDto implements Comparable<ProductDto> {
    private Integer totalAmount;

    private Integer price;

    public ProductDto(Integer totalAmount, Integer price) {
        this.totalAmount = totalAmount;
        this.price = price;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductDto{"
                + "totalAmount=" + totalAmount
                + ", price=" + price
                + '}';
    }

    @Override
    public int compareTo(ProductDto other) {
        if (this.getTotalAmount() > other.getTotalAmount()) {
            return 1;
        } else if (this.getTotalAmount() < other.getTotalAmount()) {
            return -1;
        } else if (this.getPrice() > other.getPrice()) {
            return 1;
        } else if (this.getPrice() < other.getPrice()) {
            return -1;
        }
        return 0;
    }
}
