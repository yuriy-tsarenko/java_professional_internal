package com.java_professional.examples.lesson2.ex_001_arrayList.arrayList_reverse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создаем объект arrayList
        List<String> arrayList = new ArrayList<>();

        // Создаем объект BufferedReader, для дальнейшего ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Циклом заполняем массив arrayList значениями с клавиатуры
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значение [" + i + "]");
            String s = reader.readLine();
            // Добавляем значение в конец массива
            arrayList.add(s);
        }
        Collections.shuffle(arrayList);
        // Циклом проходим по всей длине arrayList
//        for (int i = 0; i < arrayList.size(); i++) {
//            // Записываем значение последнего элемента в переменную j
//            int j = arrayList.size() - i - 1;
//            // Выводим на экран содержимое j
//            System.out.println(arrayList.get(j));
//        }

        System.out.println(arrayList);
    }
}
