package com.java_professional.examples.lesson6.test;

import java.lang.reflect.Method;

public class TestHandler {
    // Принимает массив Классов(который описывает свои классы)
    public static boolean test(Class<?>... classes) {
        try {
            for (Class<?> clazz : classes) {
                // Получаем список методов
                Method[] methods = clazz.getDeclaredMethods();
                for (Method method : methods) {
                    // Если какой либо метод аннотирован аннотацией TestAnnotation, то мы вызываем этот метод
                    // С помощью рефлексии
                    if (method.isAnnotationPresent(TestAnnotation.class)) {
                        // Чтобы вызвать статический метод, то
                        // передаем параметр null, вместо объекта
                        Boolean b = (Boolean) method.invoke(null, new Object[]{});
                        if (!b) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
