package com.java_proffesional.ruslan.homework.lesson10.task2;


import java.util.LinkedList;
import java.util.List;
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
        List<Integer> arrayRandom = new LinkedList<>();
        int number;
        for (int i = 0; i < 10; i++) {
            number = (int) (Math.random() * (100 + 1)) + 1;
            arrayRandom.add(number);
        }

        System.out.println("Массив 10 случайных чисел:\n" + arrayRandom);

        // Создаем поток из массива arrayRandom
        Stream<Integer> integerStream = arrayRandom.stream();

        Double summary = integerStream
                .map(i -> Math.pow(i, 2))//Этот метод берет последовательность входных элементов и возводит в квадрат
                .reduce((double) 0, Double::sum);//Этот метод аккамулирует сумму квадратов

        System.out.println("Сумма квадратов массива: " + summary);


    }
}