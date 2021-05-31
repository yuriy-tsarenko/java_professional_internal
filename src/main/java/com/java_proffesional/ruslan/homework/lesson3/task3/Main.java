package com.java_proffesional.ruslan.homework.lesson3.task3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework3 task3
 * Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */

public class Main {
    public static void main(String[] args) {
        writeRandomFile();
        readRandomFile();

    }

    private static void writeRandomFile() {

        int[] array = new int[19];
        for (int i = 0; i < array.length; ++i) {
            array[i] = generationRandom();
        }

        try (FileWriter writer = new FileWriter("random1.txt")) {
            for (int value : array) {
                String line = String.format("%s,", value);
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readRandomFile() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("random1.txt")))) {
            Scanner scanner = new Scanner(reader);
            scanner.useDelimiter(",");
            int[] arrayNumber = new int[19];
            int sumOfnumbers = 0;
            int counter = 0;
            for (int i = 0; i < arrayNumber.length; ) {
                int result = scanner.nextInt();
                arrayNumber[i] = result;
                if (result > 0) {
                    counter++;
                    sumOfnumbers = sumOfnumbers + result;
                }
                i++;
            }
            scanner.close();
            System.out.println("Первые 19 целых чисел до сортировки: " + "\n"
                    + Arrays.toString(arrayNumber));
            Arrays.sort(arrayNumber);
            System.out.println("Первые 19 целых чисел после сортировки: " + "\n"
                    + Arrays.toString(arrayNumber));
            System.out.println(String.format("Сумма положительных чисел: %s\n"
                    + "Количество положительных: %s\n"
                    + "Среднее значение положительных: %s", sumOfnumbers, counter, sumOfnumbers / counter));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*
     * @return - псевдослучайное целое число
     */

    private static int generationRandom() {
        final int minx = -99; // Мин. число для диапазона
        final int maxi = 99; // Макс. число для диапазона
        int diapason = maxi + Math.abs(minx) + 1;
        return (int) (Math.random() * diapason) - maxi;
    }
}


