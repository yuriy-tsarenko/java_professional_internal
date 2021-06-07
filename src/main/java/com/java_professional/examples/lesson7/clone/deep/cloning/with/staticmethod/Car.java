package com.java_professional.examples.lesson7.clone.deep.cloning.with.staticmethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Car {
    private int weight;
    private String model;

    public static Car deepCopyCar(Car carToCopy) {
        Car copiedCar = new Car();
        copiedCar.setWeight(carToCopy.getWeight());
        copiedCar.setModel(carToCopy.getModel());
        return copiedCar;
    }
}
