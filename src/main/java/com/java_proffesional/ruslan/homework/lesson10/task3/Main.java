package com.java_proffesional.ruslan.homework.lesson10.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("first value:");
        int first = scanner.nextInt();
        System.out.println("second value:");
        int second = scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.println("operator value:");
        String operator = scanner.next();

        switch (operator) {
            case "*": {
                Calculator multiplays = (a, b) -> a * b;
                int result = multiplays.calculate(first, second);
                System.out.println("result: " + result);
                break;
            }
            case "/": {
                Calculator division = (a, b) -> a / b;
                int result = division.calculate(first, second);
                System.out.println("result: " + result);
                break;
            }
            case "+": {
                Calculator plus = (a, b) -> a + b;
                int result = plus.calculate(first, second);
                System.out.println("result: " + result);
                break;
            }
            case "-": {
                Calculator minus = (a, b) -> a - b;
                int result = minus.calculate(first, second);
                System.out.println("result: " + result);
                break;
            }
            default:
                System.out.println("You entered an incorrect value");
                break;
        }
    }
}



