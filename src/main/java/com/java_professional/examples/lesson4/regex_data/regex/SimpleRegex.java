package com.java_professional.examples.lesson4.regex_data.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[а-яие]+", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//        Pattern p = Pattern.compile("[а-яА-ЯієІЄЇї']+");
        Matcher m = p.matcher("Месяц");

        Pattern p2 = Pattern.compile("[a-z&&[^d]]+");
        Matcher m2 = p2.matcher("abc");
        System.out.println("m2 " + m2.matches());
//        Pattern p = Pattern.compile("[a-zA-Z]+\\s*[a-zA-Z]+");
//        Matcher m = p.matcher("Hello World");
        boolean b = m.matches();
        System.out.println(b);
    }
}
