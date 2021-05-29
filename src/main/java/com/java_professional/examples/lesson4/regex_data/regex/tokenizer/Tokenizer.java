package com.java_professional.examples.lesson4.regex_data.regex.tokenizer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Tokenizer {
    public static final String TEST_STRING = "Название=Учим Java professional;Тема=регулярные выражения;Пример=№1;"
            + "Дата=22-01-2021";

    public static void main(String[] args) {
        System.out.println(createTokens(TEST_STRING));
        System.out.println("---------V2---------");
        System.out.println(createTokensV2(TEST_STRING));
    }

    public static Map<String, String> createTokensV2(String input) {
        StringTokenizer tokenizer = getTokenizer(input);
        Map<String, String> map = new LinkedHashMap<>();
        while (tokenizer.hasMoreTokens()) {
            String key = tokenizer.nextToken();
            String val = tokenizer.nextToken();
            map.put(key, val);
        }
        return map;
    }

    public static String createTokens(String input) {
        StringTokenizer tokenizer = getTokenizer(input);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String key = tokenizer.nextToken();
            String val = tokenizer.nextToken();
            builder
                    .append(key)
                    .append(" : ")
                    .append(val)
                    .append("\n");
        }
        return builder.toString();
    }

    private static StringTokenizer getTokenizer(String input) {
        return new StringTokenizer(input, "=;");
    }
}
