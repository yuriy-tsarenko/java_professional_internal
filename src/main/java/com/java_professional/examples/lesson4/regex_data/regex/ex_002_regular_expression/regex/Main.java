package com.java_professional.examples.lesson4.regex_data.regex.ex_002_regular_expression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Проверка на соответствие строки шаблону
        Pattern pattern = Pattern.compile("a+y*");
        Matcher matcher = pattern.matcher("aaa");

        // Соответствует строка шаблону
        boolean b = matcher.matches();
        System.out.println(b);

        // Поиск и выбор подстроки, заданной шаблоном
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?";
        String line = "адреса эл.почты:firstmail@mail.ru иsecondmail@gmail.com";

        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(line);
        while (matcher1.find()) {
            System.out.println("e-mail: " + matcher1.group());
        }

        // Разбивка строки на подстроки с применением шаблона в качестве разделителя
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java1language 22 for3everyone");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
