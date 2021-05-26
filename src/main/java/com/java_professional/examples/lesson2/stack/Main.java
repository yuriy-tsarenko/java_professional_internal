package com.java_professional.examples.lesson2.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> planets = new Stack<>();

// добавление элементов
        planets.push("Mercury");
        planets.push("Earth");
        planets.push("Saturn");

// вывод стэка
        System.out.println(planets);

// пустой стэк?
        boolean isEmpty = planets.empty();

// получить вершину стэка, без удаления
        String top = planets.peek();
        System.out.println(top);

// получить вершину стэка, с удалением
        String saturn = planets.pop();
        System.out.println(saturn);

// поиск элемента в стэке (вызов метода equals() для каждого элемента)
        int index = planets.search("Earth");
        System.out.println(index);
    }
}
