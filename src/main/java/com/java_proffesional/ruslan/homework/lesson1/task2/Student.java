package com.java_proffesional.ruslan.homework.lesson1.task2;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework1 task2
 * Вывод на экран элементов List: Создать список, заполнить его на 10 элементов и вывести на экран содержимое
 * используя iterator
 */

class Student {

    private String name;
    private String surname;
    private Integer age;


    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void reveal() {
        System.out.printf("%8s %10s %7s", name, surname, age + "\n");
    }
}

