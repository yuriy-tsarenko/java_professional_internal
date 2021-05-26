package com.java_professional.examples.lesson2.map.hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> planets = new HashMap<>();

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

// получение True если значение есть в отображении, иначе False
        boolean isExist1 = planets.containsValue("Earth");

// пустое отображение?
        boolean isEmpty = planets.isEmpty();

// удаление элемента по ключу
        planets.remove("Saturn");

// список ключей
        Set<String> set = planets.keySet();

// список значений
        Collection<Double> values = planets.values();
        ArrayList<Double> arr = new ArrayList<>(planets.values());

// множество элементов ввиде объектов интерфейса Map.Entry
        Set<Map.Entry<String, Double>> entries1 = planets.entrySet();

// перебор элементов Entry отображения с помощью for
        for (Map.Entry<String, Double> me : planets.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
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

// конвертирование Map в ArrayList: список ключей
        ArrayList<String> arrayList = new ArrayList<>(planets.keySet());

// конвертирование Map в ArrayList: список значений
        List<Double> valueList = new ArrayList<>(planets.values());

// конвертирование Map в ArrayList: список ключ-значения
        ArrayList<Map.Entry<String, Double>> entries2 = new ArrayList<>(planets.entrySet());

// упорядочивание Map по значениям

        HashMap<String, Double> planets2 = new HashMap<>();
        planets2.put("Mercury", 2439.7);
        planets2.put("Earth", 6371.0);
        planets2.put("Saturn", 58232.0);
        planets2.put("Neptune", 24622.0);
        planets2.put("Venus", 6051.8);
        ArrayList<Map.Entry<String, Double>> entries3 = new ArrayList<>(planets2.entrySet());

        entries3.sort(new Comparator<>() {

            @Override
            public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        System.out.println(planets2);
        System.out.println(entries3);

        System.out.println("----------------------------------------");
        HashMap<String, Double> planets3 = new HashMap<>();
        for (Map.Entry<String, Double> entry : entries3) {
            planets3.put(entry.getKey(), entry.getValue());
        }
        System.out.println(planets3);
    }
}

