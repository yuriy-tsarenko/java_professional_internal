package com.java_proffesional.ruslan.homework.lesson1.task2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework1 task2
 * Вывод на экран элементов List: Создать список, заполнить его на 10 элементов и вывести на экран содержимое
 * используя iterator
 */


public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student student1 = new Student("Anna", "Swarts", 21);
        Student student2 = new Student("Valera", "Belous", 25);
        Student student3 = new Student("Lara", "Vent", 24);
        Student student4 = new Student("Jon", "Black", 22);
        Student student5 = new Student("Shasa", "Viskont", 20);
        Student student6 = new Student("Roma", "Ushakov", 19);
        Student student7 = new Student("Gena", "Amocov", 23);
        Student student8 = new Student("Valera", "Belous", 25);
        Student student9 = new Student("Dmitro", "Didov", 27);
        Student student10 = new Student("Irina", "Shvedka", 22);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);


        System.out.printf("%7s %10s %9s", "Имя", "Фамилия", "Возраст");
        System.out.println("\n" + "------------------------------");

        Iterator<Student> studentIterator = list.iterator();
        while (studentIterator.hasNext()) {
            Student tmp = studentIterator.next();
            tmp.reveal();
        }
    }
}