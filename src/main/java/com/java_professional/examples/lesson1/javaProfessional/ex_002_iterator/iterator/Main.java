package com.java_professional.examples.lesson1.javaProfessional.ex_002_iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(5);
        integerList.add(8);

        System.out.println(integerList);

        // с помощью итератора можем бегать по нашему списку
        Iterator<Integer> iterator = integerList.iterator();

        // спрашиваем есть ли следующий элемент в списке, если true, то будет реализовано тело while
        while (iterator.hasNext()) {
            // переходим к следующему элементу в списке и его выводим
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

        // то же самое действие, но через оптимизированный итератор под cписки
        ListIterator<Integer> listIterator = integerList.listIterator();

        while (listIterator.hasNext()) {
            Integer tmp = listIterator.next();
            System.out.println(tmp);
        }
    }
}
