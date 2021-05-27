package com.java_proffesional.ruslan.homework.lesson2.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;


/*
by Ruslan svitliy.rk@gmail.com
Homework2 task3
Минимальное из N чисел(использовать LinkedList): 1. Ввести с клавиатуры число N. 2. Считать N целых чисел и
 заполнить ими список - метод getIntegerList. 3. Найти минимальное число среди элементов списка - метод getMinimum
*/

public class Main {

    private static LinkedList<Integer> getIntegerList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int variableNumber = 0;
        try {
            variableNumber = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода, только цифры!");
            e.printStackTrace();
        }
        for (int i = 0; i < variableNumber; i++) {
            try {
                linkedList.add(Integer.parseInt(bufferedReader.readLine()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return linkedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = getIntegerList();
        System.out.println(getMinimum(integerLinkedList));
    }

    private static int getMinimum(LinkedList<Integer> integerLinkedList) {
        int minValue = Integer.MAX_VALUE;
        for (Iterator<Integer> iterator = integerLinkedList.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            if (integer < minValue) {
                minValue = integer;
            }
        }
        return minValue;

    }
}

