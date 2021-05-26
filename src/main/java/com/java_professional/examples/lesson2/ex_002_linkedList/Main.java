package com.java_professional.examples.lesson2.ex_002_linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<String> lst = new LinkedList<>();

// добавление элементов
        lst.add("Mercury");
        lst.add("Earth");
        lst.addLast("Saturn");
        lst.addFirst("Neptune");
        lst.add(1, "Venus");

        // вставка в начало
        lst.push("Kopernik");

        // отображение списка
        System.out.println(lst);

        // добавлене несколько элементов сразу
        lst.addAll(Arrays.asList("PlanetX", "PlanetY", "PlanetZ"));

        // изменить элемент списка по индексу
        String planet = lst.set(1, "PlanetA");

        // получение True если значение есть в списке, иначе False
        boolean isExist = lst.contains("Earth");

        // получение элемента по индексу
        String planet1 = lst.get(3);

        // получение первого элемента
        String planet2 = lst.getFirst();

        // получение последнего элемента
        String planet3 = lst.getLast();

        // получить все элементы списка в виде массива
        Object[] planets = lst.toArray();

        // удалить все элементы
        lst.clear();

        // получить индекс первого элемента с указаным значением, если не найденно то -1
        int pos = lst.indexOf("Jupiter");

        // получить индекс последнего элемента с указаным значением, если не найденно то -1
        int pos2 = lst.lastIndexOf("Jupiter");

        // удаление первого элемента со значением
        lst.remove("PlanetX");
        lst.add("Planet0");
        // удалить первый элемент из списка и вернуть значение
        String planet4 = lst.removeFirst();

        // удалить первый элемент из списка и вернуть значение
        String planet5 = lst.poll();

        // удалить первый элемент из списка и вернуть значение
        lst.add("Planet0");
        String planet6 = lst.pop();

        lst.add("Planet0");
        // удалить последний элемент из списка и вернуть значение
        String planet7 = lst.removeLast();

        // размер списка
        int amount = lst.size();
        lst.add("Planet0");
        // перебор элементов списка
        for (String str : lst) {
            System.out.println(str);
        }

        // быстрый способ добавить/объединить списки
        String[] morePlanets = {"Planet1", "Planet2", "Planet3"};

        Collections.addAll(lst, morePlanets);

        // конвертирование LinkedList в ArrayList
        List<String> arr = new ArrayList<>(lst);
        System.out.println(arr);
    }
}
