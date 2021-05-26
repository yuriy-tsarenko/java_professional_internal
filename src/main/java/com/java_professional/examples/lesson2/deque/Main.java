package com.java_professional.examples.lesson2.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> planets = new LinkedList<>();

        planets.addLast("Mercury");
        planets.offerLast("Earth");
        planets.offerLast("Saturn");
        planets.offerLast("Venus");
        System.out.println(planets);

// пустая очередь?
        boolean isEmpty = planets.isEmpty();

// итерация по очереди и извлечение по одному элементу
        while (planets.peekFirst() != null) {
            System.out.println("Первый элемент: " + planets.peekFirst());
            planets.removeFirst();
            System.out.println("Очередь: " + planets);
        }

// получить первый элемент очереди, без удаления
        String top = planets.peekFirst();
        System.out.println(top);

// получить первый элемент очереди, с удалением
        String saturn = planets.pollFirst();
        System.out.println(saturn);
    }
}
