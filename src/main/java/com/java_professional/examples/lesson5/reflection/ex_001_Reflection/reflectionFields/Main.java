package com.java_professional.examples.lesson5.reflection.ex_001_Reflection.reflectionFields;

import java.lang.reflect.Field;

public class Main {
    private static final class CatFields {
        public String name = "Marsel";
        private int age = 7;
        short ears = 5;
        protected long tail = 30;
    }

    public static void main(String[] args) {
        String red = (char) 27 + "[31m";//red
        String white = (char) 27 + "[39m";//white
        String blue = (char) 27 + "[34m";//blue
        // Получаем класс который описывает класс CatMethods
        Class<CatFields> fieldsClass = CatFields.class;
        System.out.println(red + "Public Reflection fields:");
        // Метод getFields(), возвращает только поля с модификатором public
        Field[] fields = fieldsClass.getFields();
        // Пробегаемся по классу Field и выводим все public поля
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(blue + "\tName: " + white + field.getName());
            System.out.println(blue + "\tType: " + white + fieldType.getName());
        }

        System.out.println(red + "All Modifiers Reflection fields:");
        fields = fieldsClass.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(blue + "\tName: " + white + field.getName());
            System.out.println(blue + "\tType: " + white + fieldType.getName());
        }
    }
}

