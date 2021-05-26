package com.java_professional.examples.lesson2.map.customExample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Product> hashMap = new HashMap<>();
        Product product = new Product(1, "some item", "new item", 120, 10);
        Product product2 = new Product(1, "some item", "new item", 120, 10);
        Product product3 = new Product(1, "some item", "new item", 120, 10);

        int hashCode = System.identityHashCode(product);
        int hashCode1 = System.identityHashCode(product2);
        int hashCode2 = System.identityHashCode(product3);

        System.out.println(hashCode);
        System.out.println(hashCode1);
        System.out.println(hashCode2);

        hashMap.put(1, product);
        hashMap.put(1, product);
        hashMap.put(2, product);
        System.out.println(hashMap);

        HashMap<Product, Integer> hashMap2 = new HashMap<>();
        hashMap2.put(product, 1);
        hashMap2.put(product2, 1);
        hashMap2.put(product3, 1);
        System.out.println(hashMap2);

        TreeMap<Integer, Product> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });


    }

    public <K, V extends Comparable<V>> Map<K, V> sortByproductPrice(Map<K, V> sortedMap) {

        Map<K, V> sortedByValues = new TreeMap<>(new Comparator<K>() {
            public int compare(K key1, K key2) {
                return sortedMap.get(key1).compareTo(sortedMap.get(key2));
            }
        });
        sortedByValues.putAll(sortedMap);
        return sortedByValues;
    }
}
