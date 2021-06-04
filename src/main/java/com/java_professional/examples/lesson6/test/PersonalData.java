package com.java_professional.examples.lesson6.test;

public class PersonalData {
    // Тестовый метод
    @TestAnnotation
    public static boolean isValidPersonalId() {
        // Передаем строки и сравниваем с 122333
        boolean res = idCalculator("1", "22", "333").equals("122333");
        System.out.println("PersonalData is = " + res);
        return res;
    }

    // Принимаем массив строк
    private static String idCalculator(String... personalId) {
        StringBuilder sb = new StringBuilder();
        for (String tmp : personalId) {
            sb.append(tmp);
        }
        return sb.toString();
    }
}