package com.java_professional.examples.lesson3;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;


public class SimpleRandomAccessFile {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("randomText.txt", "rw");
            randomAccessFile.write(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            randomAccessFile.seek(5);
            randomAccessFile.write(new byte[]{33, 44, 55});
            randomAccessFile.seek(0);
            byte[] arr = new byte[10];
            int n = randomAccessFile.read(arr, 0, 10);
            System.out.println(Arrays.toString(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
