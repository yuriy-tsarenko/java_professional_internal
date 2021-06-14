package com.java_professional.examples.lesson10.example1.calculateWithLambdas;

public class Main {

    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> x / y;
        Operation multiple = (x, y) -> x * y;

        Operation addition = new Operation() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        Operation additionLambda = (x, y) -> x + y;

        int resultAdditionLambda = addition.calculate(10, 20);
        int resultAddition = addition.calculate(10, 20);
        int resultAdd = add.calculate(10, 20);
        int resultSub = sub.calculate(10, 20);
        int resultDiv = div.calculate(10, 20);
        int resultMultiple = multiple.calculate(10, 20);

        System.out.println(resultAddition); // 30
        System.out.println(resultAdditionLambda); // 30
        System.out.println(resultAdd); // 30
        System.out.println(resultSub); // 30
        System.out.println(resultDiv); // 30
        System.out.println(resultMultiple); // 30
    }
}

