package com.java_professional.examples.lesson2.map.treeMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> planets = new TreeMap<>();

// добавление элементов
        planets.put("Mercury", 2439.7);
        planets.put("Earth", 6371.0);
        planets.put("Saturn", 58232.0);
        planets.put("Neptune", 24622.0);
        planets.put("Venus", 6051.8);

// отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

// получить значение по ключу
        Double radius = planets.get("Earth");

// получение True если ключ есть в отображении, иначе False
        boolean isExist = planets.containsKey("Earth");


// пустое отображение?
        boolean isEmpty = planets.isEmpty();

// удаление элемента по ключу
        planets.remove("Saturn");

// список ключей
        Set<String> set = planets.keySet();

// список значений
        Collection<Double> values = planets.values();
        List<Double> arr = new ArrayList<>(planets.values());

// множество элементов ввиде объектов интерфейса Map.Entry
        Set<Map.Entry<String, Double>> entries1 = planets.entrySet();

// перебор элементов отображения с помощью for
        for (Map.Entry<String, Double> entry : planets.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " & Value: " + entry.getValue());
        }

// перебор элементов отображения с помощью while
        Set<Map.Entry<String, Double>> entries = planets.entrySet();
        Iterator<Map.Entry<String, Double>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Double> next = iterator.next();
            System.out.print(next.getKey() + ": ");
            System.out.println(next.getValue());
        }

// размер отображения
        int amount = planets.size();

// удалить все элементы
        planets.clear();


        Map<String, Double> map = sortByValues(planets);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " & Value: " + entry.getValue());
        }
    }


    // сортировка элементов по значению
// компаратор
    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {

        Map<K, V> sortedByValues = new TreeMap<K, V>(new Comparator<K>() {
            public int compare(K key1, K key2) {
                return map.get(key1).compareTo(map.get(key2));
            }
        });
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}
