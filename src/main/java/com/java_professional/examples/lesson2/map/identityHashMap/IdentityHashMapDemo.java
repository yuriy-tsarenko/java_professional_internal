package com.java_professional.examples.lesson2.map.identityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        int identityHashCode = System.identityHashCode("Word");
        int identityHashCode1 = System.identityHashCode("Word");
        int identityHashCode2 = System.identityHashCode("Word2");

        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(1, "one");
        identityHashMap.put(11, "two");
        identityHashMap.put(23, "three");
        identityHashMap.put(1, "one");
        identityHashMap.put(23, "five");

        Set<Map.Entry<Integer, String>> entries1 = identityHashMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries1) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(11, "two");
        hashMap.put(23, "three");
        hashMap.put(1, "one");
        hashMap.put(23, "five");

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
