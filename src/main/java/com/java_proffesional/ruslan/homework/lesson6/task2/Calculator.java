package com.java_proffesional.ruslan.homework.lesson6.task2;


import java.util.Scanner;

/**
 * @author Ruslan
 */

public class Calculator {
    public static void main(String[] args) {
        /*
         * Scanner allows to take values from the console: first, second, operator
         * An exception is thrown if a value is entered incorrectly ArithmeticException
         */
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
                System.out.println(e.getMessage());
                System.out.println("try again");
            }
        }
    }

    /*
     * Calling a method depending on the operator value allows to call corresponding methods
     *
     * @param first
     * @param second
     * @param operator
     * @return allows to call methods plus, minus, multiplays, multiplays;
     * @throws ArithmeticException - In case of incorrect operator value
     */
    private static int getResult(int first, int second, String operator) throws ArithmeticException {
        int result;
        switch (operator) {
            case "+":
                result = plus(first, second);
                break;
            case "-":
                result = minus(first, second);
                break;
            case "*":
                result = multiplays(first, second);
                break;
            case "/":
                result = division(first, second);
                break;

            default:
                throw new ArithmeticException("unsupported operator");
        }
        return result;
    }


    /*
     * Method call of the method allows to find out the result of division
     *
     * @param first
     * @param second
     * @return computed result
     */

    private static int division(int first, int second) {
        return first / second;
    }

    /*
     * Method call of the method allows to find out the result of multiplay
     *
     * @param first
     * @param second
     * @return computed result
     */
    private static int multiplays(int first, int second) {
        return first * second;
    }

    /*
     * Method call of the method allows to find out the result of plus
     *
     * @param first
     * @param second
     * @return computed result
     */
    private static int plus(int first, int second) {
        return first + second;
    }

    /*
     * Method call of the method allows to find out the result of minus
     *
     * @param  first
     * @param second
     * @return computed result
     */
    private static int minus(int first, int second) {
        return first - second;
    }
}
