package com.java_proffesional.ruslan.homework.lesson6.task2;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * @link com.cbs.java_essential.examples.lesson8;
 *
 * @author Ruslan
 *
 */

public class Calculator {

    private static final Logger log = Logger.getLogger(Calculator.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("first value:");
            int first = scanner.nextInt();
            System.out.println("second value:");
            int second = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("operator value:");
            String operator = scanner.next();
            try {
                int result = getResult(first, second, operator);
                System.out.println("result: " + result);
                flag = false;
            } catch (ArithmeticException e) {
                log.warn(e);
                System.out.println(e.getMessage());
                System.out.println("try again");
            }
        }
    }


    private static int getResult(int first, int second, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return plus(first, second);
            case "-":
                return minus(first, second);
            default:
                throw new ArithmeticException("unsupported operator");
        }
    }


    private static int plus(int first, int second) {
        return first + second;
    }

    private static int minus(int first, int second) {
        return first - second;
    }
}
