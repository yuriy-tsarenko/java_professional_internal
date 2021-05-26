package com.java_professional.examples.lesson2.map.weakHashMap;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;


public class WeakHashMapDemo {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> weakHashMap = new WeakHashMap<>();

        String keyHashMap = new String("keyHashMap");
        String keyWeakHashMap = new String("keyWeakHashMap");

        hashMap.put(keyHashMap, "helloHash");
        weakHashMap.put(keyWeakHashMap, "helloWeakHash");
        System.out.println("Before: hash map value:" + hashMap.get("keyHashMap")
                + "\nand weak hash map value: " + weakHashMap.get("keyWeakHashMap"));

        keyHashMap = null;
        keyWeakHashMap = null;

        System.gc();

        //тут в консоли видим как ключ keyWeakHashMap равен 'null'
        System.out.println("After: hash map value:" + hashMap.get("keyHashMap")
                + "\nand weak hash map value: " + weakHashMap.get("keyWeakHashMap"));


        //Сильная ссылка - это наиболее распространенный тип ссылки,
        // который мы используем в повседневном программировании:
        Integer prime1 = 1;

        // Объекты, на которые ссылаются только слабые ссылки, быстро собираются мусором;
        // В этом случае сборщик мусора не будет ждать, пока ему понадобится память.
        // Мы можем создать WeakReference в Java следующим образом:
        Integer prime2 = 1;
        WeakReference<Integer> weakReference = new WeakReference<Integer>(prime2);
        prime2 = null;

        // Проще говоря, объект, на который указывает ссылка SoftReference,
        // не будет обрабатываться сборщиком мусора до тех пор, пока JVM полностью не понадобится память.
        // Давайте посмотрим, как мы можем создать SoftReference в Java:
        Integer prime3 = 1;
        SoftReference<Integer> softReference = new SoftReference<Integer>(prime3);
        prime3 = null;
    }
}
