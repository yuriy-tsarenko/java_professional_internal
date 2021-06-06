package com.java_proffesional.ruslan.homework.lesson6.task3;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author Ruslan
 * Homework6 task3
 */

public class Main {
    public static void main(String[] args) {
        try {
            FeatureLion lion = new FeatureLion();
            Annotation[] annotations = lion.getClass().getAnnotations();

            System.out.println(lion.getClass().getName() + " annotations:");

            for (Annotation annotation : annotations) {
                System.out.printf("%s%n", annotation);
            }

            Method[] methods = lion.getClass().getMethods();
            System.out.println(" Method annotations:");

            for (Method method : methods) {
                Annotation[] methodAnnotations = method.getAnnotations();

                if (methodAnnotations.length > 0) {
                    System.out.printf("%s%n", method.getName() + "():");
                }
            }

        } catch (Exception exc) {
            System.out.println(exc.getMessage());

        }

    }

}