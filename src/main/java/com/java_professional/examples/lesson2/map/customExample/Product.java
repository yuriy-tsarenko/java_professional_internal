package com.java_professional.examples.lesson2.map.customExample;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = "id")
public class Product implements Comparable<Product> {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer totalNumber;

    @Override
    public int compareTo(Product other) {
        return this.price - other.getPrice();
    }
}
