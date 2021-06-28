package com.java_proffesional.ruslan.homework.lesson5.task3;

/**
 * @author Ruslan
 * Homework5 task3
 * Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы. Под средством рефлексии
 * получите всю информацию о полях, методах, конструкторах, а также модификаторах доступа
 */

public class PetForYou {

    private String petName;
    private int petAge;
    private boolean tail;

   public PetForYou(String petName, int petAge, boolean tail) {
        this.petName = petName;
        this.petAge = petAge;
        this.tail = tail;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "  Имя: "
                + this.petName + ", возраст: "
                + this.petAge + ", хвост: "
                + conversion(this.tail)
                + " \n ";
    }

    private static String conversion(boolean bool) {
        if (bool) {
            return "да";
        } else {
            return "нет";
        }
    }
}
