package com.java_professional.examples.lesson7.clone.deep.cloning.with.staticmethod;


public class Main {
    public static void main(String[] args) {
        // 1st example
        Human human = new Human(20, "Robert");
        Human cloneHuman = Human.cloneHuman(human);

        System.out.println(cloneHuman);

        // 2nd example
        Car car = new Car(2500, "BMW");
        System.out.println("Original car = " + car);

        Car copiedCar = Car.deepCopyCar(car);
        System.out.println("Copied car = " + copiedCar);
    }
}
