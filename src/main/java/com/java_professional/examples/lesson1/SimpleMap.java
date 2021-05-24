package com.java_professional.examples.lesson1;

import java.util.HashMap;
import java.util.Map;


public class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(null, 100);
        map.put(null, 120);
        System.out.println(map.size());
        map.put("World", 150);
        map.put("World", 170);
        map.put("World1", 150);
        map.put("World2", 250);
        System.out.println(map.size());
        System.out.println(map);

        for (Map.Entry<String, Integer> tmp : map.entrySet()) {
            System.out.println(tmp.getKey() + " " + tmp.getValue());
        }
    }
}
