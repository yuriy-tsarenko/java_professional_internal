package com.java_professional.examples.lesson7.serialization.serialization1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Car implements Serializable {
    private int price;
    private String model;

    //не сериализуется
    private transient String owner;
//    private static String owner;

    public Car(int price, String model, String owner) {
        this.price = price;
        this.model = model;
        this.owner = owner;
    }
}