package com.java_professional.examples.lesson1.javaProfessional.ex_001_foreach.foreachWithPrimitives;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};

//         Вывод на экран элементов массива x при помощи цикла for
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(x));

//         Вывод на экран элементов массива x при помощи цикла foreach
        for (int tmp : x) {
            System.out.print(tmp + " ");
        }
        System.out.println();

//         Изменения значения поля класса
        for (int tmp : x) {
            ++tmp;
            System.out.print(tmp + " ");
        }
        System.out.println();

        // Вывод на экран элементов массива x при помощи цикла foreach
        for (int tmp : x) {
            System.out.print(tmp + " ");
        }
    }
}
