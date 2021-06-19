package com.java_proffesional.ruslan.homework.lesson10.task2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * @author Ruslan
 * Homework10 task2
 * Создать список и заполнить рандомными числами 10 ячеек, нужно вывести сумму квадратов всех элементов списка.
 * Мы используем метод map() для возведения в квадрат каждого элемента, а потом применяем метод reduce()
 * для свертки всех элементов в одно число.
 */

public class Main {

    public static void main(String[] args) {


        // Создаем список данных из случайного массива чисел
        ArrayList<Integer> arrayRandom = new ArrayList<>();
        int number;
        for (int i = 0; i < 10; i++) {
            number = ThreadLocalRandom.current().nextInt(1, 100);
            arrayRandom.add(number);
        }

        System.out.println("Массив 10 случайных чисел:\n" + arrayRandom);

        // Создаем поток из массива arrayRandom
        Stream<Integer> integerStream = arrayRandom.stream();

        Integer summary = integerStream
                .map(i -> i * i)//Этот метод берет последовательность входных элементов и возводит в квадрат
                .reduce(0, Integer::sum);//Этот метод аккамулирует сумму квадратов

        System.out.println("Сумма квадратов массива: " + summary);


    }
}