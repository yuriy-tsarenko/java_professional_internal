package com.java_proffesional.ruslan.homework.lesson5.addtask;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Ruslan
 * Homework5 addtask
 * Создайте 2 класса, Animal и Cat. В классе Animal инициализируйте 3 поля различных модификаторов.
 * В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого из полей
 */

@NoArgsConstructor
@Setter
@Getter

public class Animal {

    public boolean tail;
    protected int petAge;
    private String petName;

    Animal(String petName, int petAge, boolean tail) {
        this.petName = petName;
        this.petAge = petAge;
        this.tail = tail;
    }
}
