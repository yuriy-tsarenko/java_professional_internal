package com.java_professional.examples.lesson2.map.weakHashMap;

import java.util.Random;

public class DataGenerator {
    public static Byte[] getRandomByteBuffer(int size) {
        Byte[] bytes = new Byte[size];
        for (int i = 0; i < size; i++) {
            bytes[i] = (byte) new Random().nextInt(127);
        }
        return bytes;
    }
}
