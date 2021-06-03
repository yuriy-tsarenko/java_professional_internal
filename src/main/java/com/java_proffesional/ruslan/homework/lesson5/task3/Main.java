package com.java_proffesional.ruslan.homework.lesson5.task3;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * @author Ruslan
 * Homework5 task3
 * Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы. Под средством рефлексии
 * получите всю информацию о полях, методах, конструкторах, а также модификаторах доступа
 */


public class Main {
    public static void main(String[] args) {

        Class<?> clazz = PetForYou.class;

        String colorOne = (char) 27 + "[31m";
        String colorTwo = (char) 27 + "[35m";
        String colorThree = (char) 27 + "[34m";
        String colorFour = (char) 27 + "[36m";

        System.out.println("Родительский класс: "
                + clazz.getSuperclass()
                + colorOne);
        System.out.println("Имя класса: "
                + clazz
                + colorTwo);
        System.out.print("Модификатор класса: ");
        int mods = clazz.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
        System.out.println();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fld = field.getType();
            System.out.println(colorThree + "Имя поля: " + field.getName());
            System.out.println("тип: " + fld.getName());
        }
        System.out.println();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(colorFour + "Метод класса: : " + method.getName());
            System.out.println("тип возвращаемого им значения: "
                    + method.getReturnType().getName());
        }
        System.out.println();

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class<?>[] params = constructor.getParameterTypes();
            System.out.println(colorOne + "Конструкторы класса: ");
            for (Class<?> param : params) {
                System.out.println(param.getName());
            }
        }
    }
}

